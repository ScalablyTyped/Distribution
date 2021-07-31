package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletedPart extends StObject {
  
  /**
    * Entity tag returned when the part was uploaded.
    */
  var ETag: js.UndefOr[typings.awsSdk.s3Mod.ETag] = js.undefined
  
  /**
    * Part number that identifies the part. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: js.UndefOr[typings.awsSdk.s3Mod.PartNumber] = js.undefined
}
object CompletedPart {
  
  @scala.inline
  def apply(): CompletedPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletedPart]
  }
  
  @scala.inline
  implicit class CompletedPartMutableBuilder[Self <: CompletedPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setPartNumber(value: PartNumber): Self = StObject.set(x, "PartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartNumberUndefined: Self = StObject.set(x, "PartNumber", js.undefined)
  }
}
