package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEmailDestination extends StObject {
  
  var Destination: typings.awsSdk.sesMod.Destination
  
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendBulkTemplatedEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
    */
  var ReplacementTags: js.UndefOr[MessageTagList] = js.undefined
  
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var ReplacementTemplateData: js.UndefOr[TemplateData] = js.undefined
}
object BulkEmailDestination {
  
  @scala.inline
  def apply(Destination: Destination): BulkEmailDestination = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkEmailDestination]
  }
  
  @scala.inline
  implicit class BulkEmailDestinationMutableBuilder[Self <: BulkEmailDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Destination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementTags(value: MessageTagList): Self = StObject.set(x, "ReplacementTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementTagsUndefined: Self = StObject.set(x, "ReplacementTags", js.undefined)
    
    @scala.inline
    def setReplacementTagsVarargs(value: MessageTag*): Self = StObject.set(x, "ReplacementTags", js.Array(value :_*))
    
    @scala.inline
    def setReplacementTemplateData(value: TemplateData): Self = StObject.set(x, "ReplacementTemplateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementTemplateDataUndefined: Self = StObject.set(x, "ReplacementTemplateData", js.undefined)
  }
}
