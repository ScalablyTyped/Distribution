package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3JobDefinition extends StObject {
  
  /**
    * An array of objects, one for each AWS account that owns buckets to analyze. Each object specifies the account ID for an account and one or more buckets to analyze for the account.
    */
  var bucketDefinitions: js.UndefOr[listOfS3BucketDefinitionForJob] = js.undefined
  
  /**
    * The property- and tag-based conditions that determine which objects to include or exclude from the analysis.
    */
  var scoping: js.UndefOr[Scoping] = js.undefined
}
object S3JobDefinition {
  
  inline def apply(): S3JobDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3JobDefinition]
  }
  
  extension [Self <: S3JobDefinition](x: Self) {
    
    inline def setBucketDefinitions(value: listOfS3BucketDefinitionForJob): Self = StObject.set(x, "bucketDefinitions", value.asInstanceOf[js.Any])
    
    inline def setBucketDefinitionsUndefined: Self = StObject.set(x, "bucketDefinitions", js.undefined)
    
    inline def setBucketDefinitionsVarargs(value: S3BucketDefinitionForJob*): Self = StObject.set(x, "bucketDefinitions", js.Array(value :_*))
    
    inline def setScoping(value: Scoping): Self = StObject.set(x, "scoping", value.asInstanceOf[js.Any])
    
    inline def setScopingUndefined: Self = StObject.set(x, "scoping", js.undefined)
  }
}
