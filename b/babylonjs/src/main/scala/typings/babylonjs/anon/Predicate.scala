package typings.babylonjs.anon

import typings.babylonjs.BABYLON.TransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Predicate extends StObject {
  
  var doNotInstantiate: js.UndefOr[Boolean | (js.Function1[/* node */ TransformNode, Boolean])] = js.undefined
  
  var predicate: js.UndefOr[js.Function1[/* entity */ Any, Boolean]] = js.undefined
}
object Predicate {
  
  inline def apply(): Predicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Predicate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Predicate] (val x: Self) extends AnyVal {
    
    inline def setDoNotInstantiate(value: Boolean | (js.Function1[/* node */ TransformNode, Boolean])): Self = StObject.set(x, "doNotInstantiate", value.asInstanceOf[js.Any])
    
    inline def setDoNotInstantiateFunction1(value: /* node */ TransformNode => Boolean): Self = StObject.set(x, "doNotInstantiate", js.Any.fromFunction1(value))
    
    inline def setDoNotInstantiateUndefined: Self = StObject.set(x, "doNotInstantiate", js.undefined)
    
    inline def setPredicate(value: /* entity */ Any => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
    
    inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
  }
}
