package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectOptions
  extends RadioMixinOptions
     with /* index */ StringDictionary[js.Any] {
  
  /**
    * Initialize is called immediately after the Object has been instantiated,
    * and is invoked with the same arguments that the constructor received.
    */
  var initialize: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], Unit]] = js.native
}
object ObjectOptions {
  
  @scala.inline
  def apply(): ObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOptions]
  }
  
  @scala.inline
  implicit class ObjectOptionsMutableBuilder[Self <: ObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialize(value: /* options */ js.UndefOr[ObjectOptions] => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
  }
}
