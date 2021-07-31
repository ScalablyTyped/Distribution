package typings.chartmogulNode.mod

import typings.chartmogulNode.commonMod.Entries
import typings.chartmogulNode.commonMod.Strings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tag {
  
  @JSImport("chartmogul-node", "Tag")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(config: Config, uuid: String, data: Tags): js.Promise[Tags] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tags]]
  @scala.inline
  def add(config: Config, uuid: String, data: TagsWithEmail): js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Entries[typings.chartmogulNode.mod.Customer.Customer]]]
  
  @scala.inline
  def remove(config: Config, uuid: String, data: Tags): js.Promise[Tags] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tags]]
  
  trait Tags extends StObject {
    
    var tags: Strings
  }
  object Tags {
    
    @scala.inline
    def apply(tags: Strings): Tags = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tags]
    }
    
    @scala.inline
    implicit class TagsMutableBuilder[Self <: Tags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: Strings): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  trait TagsWithEmail extends StObject {
    
    var email: String
    
    var tags: Strings
  }
  object TagsWithEmail {
    
    @scala.inline
    def apply(email: String, tags: Strings): TagsWithEmail = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagsWithEmail]
    }
    
    @scala.inline
    implicit class TagsWithEmailMutableBuilder[Self <: TagsWithEmail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Strings): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
}
