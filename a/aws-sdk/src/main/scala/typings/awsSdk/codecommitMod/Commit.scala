package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commit extends StObject {
  
  /**
    * Any other data associated with the specified commit.
    */
  var additionalData: js.UndefOr[AdditionalData] = js.undefined
  
  /**
    * Information about the author of the specified commit. Information includes the date in timestamp format with GMT offset, the name of the author, and the email address for the author, as configured in Git.
    */
  var author: js.UndefOr[UserInfo] = js.undefined
  
  /**
    * The full SHA ID of the specified commit. 
    */
  var commitId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * Information about the person who committed the specified commit, also known as the committer. Information includes the date in timestamp format with GMT offset, the name of the committer, and the email address for the committer, as configured in Git. For more information about the difference between an author and a committer in Git, see Viewing the Commit History in Pro Git by Scott Chacon and Ben Straub.
    */
  var committer: js.UndefOr[UserInfo] = js.undefined
  
  /**
    * The commit message associated with the specified commit.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * A list of parent commits for the specified commit. Each parent commit ID is the full commit ID.
    */
  var parents: js.UndefOr[ParentList] = js.undefined
  
  /**
    * Tree information for the specified commit.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}
object Commit {
  
  @scala.inline
  def apply(): Commit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Commit]
  }
  
  @scala.inline
  implicit class CommitMutableBuilder[Self <: Commit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalData(value: AdditionalData): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
    
    @scala.inline
    def setAuthor(value: UserInfo): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setCommitId(value: ObjectId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
    
    @scala.inline
    def setCommitter(value: UserInfo): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setParents(value: ParentList): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
    
    @scala.inline
    def setParentsVarargs(value: ObjectId*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    @scala.inline
    def setTreeId(value: ObjectId): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
  }
}
