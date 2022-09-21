package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPassDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  var colorAttachments: js.Array[GPURenderPassColorAttachment | Null]
  
  var depthStencilAttachment: js.UndefOr[GPURenderPassDepthStencilAttachment] = js.undefined
  
  var occlusionQuerySet: js.UndefOr[GPUQuerySet] = js.undefined
  
  var timestampWrites: js.UndefOr[GPURenderPassTimestampWrites] = js.undefined
}
object GPURenderPassDescriptor {
  
  inline def apply(colorAttachments: js.Array[GPURenderPassColorAttachment | Null]): GPURenderPassDescriptor = {
    val __obj = js.Dynamic.literal(colorAttachments = colorAttachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderPassDescriptor]
  }
  
  extension [Self <: GPURenderPassDescriptor](x: Self) {
    
    inline def setColorAttachments(value: js.Array[GPURenderPassColorAttachment | Null]): Self = StObject.set(x, "colorAttachments", value.asInstanceOf[js.Any])
    
    inline def setColorAttachmentsVarargs(value: (GPURenderPassColorAttachment | Null)*): Self = StObject.set(x, "colorAttachments", js.Array(value*))
    
    inline def setDepthStencilAttachment(value: GPURenderPassDepthStencilAttachment): Self = StObject.set(x, "depthStencilAttachment", value.asInstanceOf[js.Any])
    
    inline def setDepthStencilAttachmentUndefined: Self = StObject.set(x, "depthStencilAttachment", js.undefined)
    
    inline def setOcclusionQuerySet(value: GPUQuerySet): Self = StObject.set(x, "occlusionQuerySet", value.asInstanceOf[js.Any])
    
    inline def setOcclusionQuerySetUndefined: Self = StObject.set(x, "occlusionQuerySet", js.undefined)
    
    inline def setTimestampWrites(value: GPURenderPassTimestampWrites): Self = StObject.set(x, "timestampWrites", value.asInstanceOf[js.Any])
    
    inline def setTimestampWritesUndefined: Self = StObject.set(x, "timestampWrites", js.undefined)
    
    inline def setTimestampWritesVarargs(value: GPURenderPassTimestampWrite*): Self = StObject.set(x, "timestampWrites", js.Array(value*))
  }
}
