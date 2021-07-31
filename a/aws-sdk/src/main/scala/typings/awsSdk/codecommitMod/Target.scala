package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  /**
    * The branch of the repository where the pull request changes are merged. Also known as the destination branch.
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.undefined
  
  /**
    * The name of the repository that contains the pull request.
    */
  var repositoryName: RepositoryName
  
  /**
    * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
    */
  var sourceReference: ReferenceName
}
object Target {
  
  @scala.inline
  def apply(repositoryName: RepositoryName, sourceReference: ReferenceName): Target = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], sourceReference = sourceReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationReference(value: ReferenceName): Self = StObject.set(x, "destinationReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationReferenceUndefined: Self = StObject.set(x, "destinationReference", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceReference(value: ReferenceName): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
  }
}
