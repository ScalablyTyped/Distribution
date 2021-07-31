package typings.awsSdkBuildTypes.apiModelMod

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
  
  @scala.inline
  def apply(): Blob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("blob")
    __obj.asInstanceOf[Blob]
  }
  
  @scala.inline
  implicit class BlobMutableBuilder[Self <: Blob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreaming(value: scala.Boolean): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
    
    @scala.inline
    def setType(value: blob): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
