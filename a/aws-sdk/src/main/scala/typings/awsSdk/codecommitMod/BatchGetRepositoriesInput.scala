package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetRepositoriesInput extends js.Object {
  /**
    * The names of the repositories to get information about.  The length constraint limit is for each string in the array. The array itself can be empty. 
    */
  var repositoryNames: RepositoryNameList = js.native
}

object BatchGetRepositoriesInput {
  @scala.inline
  def apply(repositoryNames: RepositoryNameList): BatchGetRepositoriesInput = {
    val __obj = js.Dynamic.literal(repositoryNames = repositoryNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetRepositoriesInput]
  }
}

