package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait Grpc_ extends Instrumentation {
  
  /**
    * An array of metadata entries to record. Can also be a callback that returns
    * the key/value pairs to record. For example, using
    * `variables => variables` would record all variables.
    */
  var metadata: js.UndefOr[
    js.Array[String] | (js.Function1[/* variables */ StringDictionary[js.Any], StringDictionary[_]])
  ] = js.native
}
object Grpc_ {
  
  @scala.inline
  def apply(): Grpc_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grpc_]
  }
  
  @scala.inline
  implicit class Grpc_MutableBuilder[Self <: Grpc_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(
      value: js.Array[String] | (js.Function1[/* variables */ StringDictionary[js.Any], StringDictionary[_]])
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataFunction1(value: /* variables */ StringDictionary[js.Any] => StringDictionary[_]): Self = StObject.set(x, "metadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMetadataVarargs(value: String*): Self = StObject.set(x, "metadata", js.Array(value :_*))
  }
}
