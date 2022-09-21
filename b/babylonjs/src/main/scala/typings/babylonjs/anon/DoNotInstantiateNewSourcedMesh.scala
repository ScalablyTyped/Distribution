package typings.babylonjs.anon

import typings.babylonjs.BABYLON.TransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoNotInstantiateNewSourcedMesh extends StObject {
  
  var doNotInstantiate: Boolean | (js.Function1[/* node */ TransformNode, Boolean])
  
  var newSourcedMesh: js.UndefOr[typings.babylonjs.BABYLON.Mesh] = js.undefined
}
object DoNotInstantiateNewSourcedMesh {
  
  inline def apply(doNotInstantiate: Boolean | (js.Function1[/* node */ TransformNode, Boolean])): DoNotInstantiateNewSourcedMesh = {
    val __obj = js.Dynamic.literal(doNotInstantiate = doNotInstantiate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoNotInstantiateNewSourcedMesh]
  }
  
  extension [Self <: DoNotInstantiateNewSourcedMesh](x: Self) {
    
    inline def setDoNotInstantiate(value: Boolean | (js.Function1[/* node */ TransformNode, Boolean])): Self = StObject.set(x, "doNotInstantiate", value.asInstanceOf[js.Any])
    
    inline def setDoNotInstantiateFunction1(value: /* node */ TransformNode => Boolean): Self = StObject.set(x, "doNotInstantiate", js.Any.fromFunction1(value))
    
    inline def setNewSourcedMesh(value: typings.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "newSourcedMesh", value.asInstanceOf[js.Any])
    
    inline def setNewSourcedMeshUndefined: Self = StObject.set(x, "newSourcedMesh", js.undefined)
  }
}
