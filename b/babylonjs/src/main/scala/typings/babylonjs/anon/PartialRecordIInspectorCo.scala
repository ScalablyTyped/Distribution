package typings.babylonjs.anon

import typings.babylonjs.debugDebugLayerMod.IInspectorContextMenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<babylonjs.babylonjs/Debug/debugLayer.IInspectorContextMenuType, std.Array<babylonjs.babylonjs/Debug/debugLayer.IInspectorContextMenuItem>>> */
trait PartialRecordIInspectorCo extends StObject {
  
  var materials: js.UndefOr[js.Array[IInspectorContextMenuItem]] = js.undefined
  
  var node: js.UndefOr[js.Array[IInspectorContextMenuItem]] = js.undefined
  
  var particleSystems: js.UndefOr[js.Array[IInspectorContextMenuItem]] = js.undefined
  
  var pipeline: js.UndefOr[js.Array[IInspectorContextMenuItem]] = js.undefined
  
  var spriteManagers: js.UndefOr[js.Array[IInspectorContextMenuItem]] = js.undefined
}
object PartialRecordIInspectorCo {
  
  inline def apply(): PartialRecordIInspectorCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordIInspectorCo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordIInspectorCo] (val x: Self) extends AnyVal {
    
    inline def setMaterials(value: js.Array[IInspectorContextMenuItem]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: IInspectorContextMenuItem*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setNode(value: js.Array[IInspectorContextMenuItem]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setNodeVarargs(value: IInspectorContextMenuItem*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParticleSystems(value: js.Array[IInspectorContextMenuItem]): Self = StObject.set(x, "particleSystems", value.asInstanceOf[js.Any])
    
    inline def setParticleSystemsUndefined: Self = StObject.set(x, "particleSystems", js.undefined)
    
    inline def setParticleSystemsVarargs(value: IInspectorContextMenuItem*): Self = StObject.set(x, "particleSystems", js.Array(value*))
    
    inline def setPipeline(value: js.Array[IInspectorContextMenuItem]): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setPipelineVarargs(value: IInspectorContextMenuItem*): Self = StObject.set(x, "pipeline", js.Array(value*))
    
    inline def setSpriteManagers(value: js.Array[IInspectorContextMenuItem]): Self = StObject.set(x, "spriteManagers", value.asInstanceOf[js.Any])
    
    inline def setSpriteManagersUndefined: Self = StObject.set(x, "spriteManagers", js.undefined)
    
    inline def setSpriteManagersVarargs(value: IInspectorContextMenuItem*): Self = StObject.set(x, "spriteManagers", js.Array(value*))
  }
}
