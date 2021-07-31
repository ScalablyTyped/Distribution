package typings.azure.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageAccessCondition extends StObject {
  
  var `If-Match`: String
  
  var `If-Modified-Since`: Date
  
  var `If-None-Match`: String
  
  var `If-Unmodified-Since`: Date
}
object StorageAccessCondition {
  
  @scala.inline
  def apply(
    `If-Match`: String,
    `If-Modified-Since`: Date,
    `If-None-Match`: String,
    `If-Unmodified-Since`: Date
  ): StorageAccessCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("If-Match")(`If-Match`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-Modified-Since")(`If-Modified-Since`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-None-Match")(`If-None-Match`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-Unmodified-Since")(`If-Unmodified-Since`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageAccessCondition]
  }
  
  @scala.inline
  implicit class StorageAccessConditionMutableBuilder[Self <: StorageAccessCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setIf-Match`(value: String): Self = StObject.set(x, "If-Match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIf-Modified-Since`(value: Date): Self = StObject.set(x, "If-Modified-Since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIf-None-Match`(value: String): Self = StObject.set(x, "If-None-Match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIf-Unmodified-Since`(value: Date): Self = StObject.set(x, "If-Unmodified-Since", value.asInstanceOf[js.Any])
  }
}
