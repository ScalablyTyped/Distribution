package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeModelPackageOutput extends StObject {
  
  /**
    * A map of the resource and BatchDescribeModelPackageError objects reporting the error associated with describing the model package.
    */
  var BatchDescribeModelPackageErrorMap: js.UndefOr[typings.awsSdk.sagemakerMod.BatchDescribeModelPackageErrorMap] = js.undefined
  
  /**
    * The summaries for the model package versions
    */
  var ModelPackageSummaries: js.UndefOr[typings.awsSdk.sagemakerMod.ModelPackageSummaries] = js.undefined
}
object BatchDescribeModelPackageOutput {
  
  inline def apply(): BatchDescribeModelPackageOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDescribeModelPackageOutput]
  }
  
  extension [Self <: BatchDescribeModelPackageOutput](x: Self) {
    
    inline def setBatchDescribeModelPackageErrorMap(value: BatchDescribeModelPackageErrorMap): Self = StObject.set(x, "BatchDescribeModelPackageErrorMap", value.asInstanceOf[js.Any])
    
    inline def setBatchDescribeModelPackageErrorMapUndefined: Self = StObject.set(x, "BatchDescribeModelPackageErrorMap", js.undefined)
    
    inline def setModelPackageSummaries(value: ModelPackageSummaries): Self = StObject.set(x, "ModelPackageSummaries", value.asInstanceOf[js.Any])
    
    inline def setModelPackageSummariesUndefined: Self = StObject.set(x, "ModelPackageSummaries", js.undefined)
  }
}
