package typings.awsSdkBuildTypes.buildApiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blob
  extends StObject
     with ShapeDef
     with Shape {
  
  var streaming: js.UndefOr[scala.Boolean] = js.undefined
  
  @JSName("type")
  val type_Blob: blob
}
object Blob {
  
  inline def apply(): Blob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("blob")
    __obj.asInstanceOf[Blob]
  }
  
  extension [Self <: Blob](x: Self) {
    
    inline def setStreaming(value: scala.Boolean): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    inline def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
    
    inline def setType(value: blob): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
