package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartOfSpeechTag extends StObject {
  
  /**
    * The confidence that Amazon Comprehend has that the part of speech was correctly identified.
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    * Identifies the part of speech that the token represents.
    */
  var Tag: js.UndefOr[PartOfSpeechTagType] = js.undefined
}
object PartOfSpeechTag {
  
  @scala.inline
  def apply(): PartOfSpeechTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartOfSpeechTag]
  }
  
  @scala.inline
  implicit class PartOfSpeechTagMutableBuilder[Self <: PartOfSpeechTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    @scala.inline
    def setTag(value: PartOfSpeechTagType): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
