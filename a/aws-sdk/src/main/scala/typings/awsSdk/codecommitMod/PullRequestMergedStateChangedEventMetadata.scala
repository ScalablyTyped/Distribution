package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullRequestMergedStateChangedEventMetadata extends StObject {
  
  /**
    * The name of the branch that the pull request is merged into.
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.undefined
  
  /**
    * Information about the merge state change event.
    */
  var mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined
  
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object PullRequestMergedStateChangedEventMetadata {
  
  inline def apply(): PullRequestMergedStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestMergedStateChangedEventMetadata]
  }
  
  extension [Self <: PullRequestMergedStateChangedEventMetadata](x: Self) {
    
    inline def setDestinationReference(value: ReferenceName): Self = StObject.set(x, "destinationReference", value.asInstanceOf[js.Any])
    
    inline def setDestinationReferenceUndefined: Self = StObject.set(x, "destinationReference", js.undefined)
    
    inline def setMergeMetadata(value: MergeMetadata): Self = StObject.set(x, "mergeMetadata", value.asInstanceOf[js.Any])
    
    inline def setMergeMetadataUndefined: Self = StObject.set(x, "mergeMetadata", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
