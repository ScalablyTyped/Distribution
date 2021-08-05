package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectOptions
  extends StObject
     with RadioMixinOptions
     with /* index */ StringDictionary[js.Any] {
  
  /**
    * Initialize is called immediately after the Object has been instantiated,
    * and is invoked with the same arguments that the constructor received.
    */
  var initialize: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], Unit]] = js.undefined
}
object ObjectOptions {
  
  inline def apply(): ObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOptions]
  }
  
  extension [Self <: ObjectOptions](x: Self) {
    
    inline def setInitialize(value: /* options */ js.UndefOr[ObjectOptions] => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
  }
}
