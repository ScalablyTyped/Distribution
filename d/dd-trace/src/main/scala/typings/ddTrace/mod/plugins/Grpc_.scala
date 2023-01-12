package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait Grpc_
  extends StObject
     with Instrumentation {
  
  /**
    * An array of metadata entries to record. Can also be a callback that returns
    * the key/value pairs to record. For example, using
    * `variables => variables` would record all variables.
    */
  var metadata: js.UndefOr[
    js.Array[String] | (js.Function1[/* variables */ StringDictionary[Any], StringDictionary[Any]])
  ] = js.undefined
}
object Grpc_ {
  
  inline def apply(): Grpc_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grpc_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Grpc_] (val x: Self) extends AnyVal {
    
    inline def setMetadata(
      value: js.Array[String] | (js.Function1[/* variables */ StringDictionary[Any], StringDictionary[Any]])
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataFunction1(value: /* variables */ StringDictionary[Any] => StringDictionary[Any]): Self = StObject.set(x, "metadata", js.Any.fromFunction1(value))
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: String*): Self = StObject.set(x, "metadata", js.Array(value*))
  }
}
