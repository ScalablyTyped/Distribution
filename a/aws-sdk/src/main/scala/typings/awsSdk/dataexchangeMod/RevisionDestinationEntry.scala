package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevisionDestinationEntry extends StObject {
  
  /**
    * The S3 bucket that is the destination for the assets in the revision.
    */
  var Bucket: string
  
  /**
    * A string representing the pattern for generated names of the individual assets in the revision. For more information about key patterns, see Key patterns when exporting revisions.
    */
  var KeyPattern: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the revision.
    */
  var RevisionId: Id
}
object RevisionDestinationEntry {
  
  inline def apply(Bucket: string, RevisionId: Id): RevisionDestinationEntry = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionDestinationEntry]
  }
  
  extension [Self <: RevisionDestinationEntry](x: Self) {
    
    inline def setBucket(value: string): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKeyPattern(value: string): Self = StObject.set(x, "KeyPattern", value.asInstanceOf[js.Any])
    
    inline def setKeyPatternUndefined: Self = StObject.set(x, "KeyPattern", js.undefined)
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
