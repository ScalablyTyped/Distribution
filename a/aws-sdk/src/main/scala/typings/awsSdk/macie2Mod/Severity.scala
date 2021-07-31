package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Severity extends StObject {
  
  /**
    * The qualitative representation of the finding's severity, ranging from Low (least severe) to High (most severe).
    */
  var description: js.UndefOr[SeverityDescription] = js.undefined
  
  /**
    * The numerical representation of the finding's severity, ranging from 1 (least severe) to 3 (most severe).
    */
  var score: js.UndefOr[long] = js.undefined
}
object Severity {
  
  @scala.inline
  def apply(): Severity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Severity]
  }
  
  @scala.inline
  implicit class SeverityMutableBuilder[Self <: Severity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: SeverityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setScore(value: long): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
