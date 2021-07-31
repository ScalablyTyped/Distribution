package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamoDBTarget extends StObject {
  
  /**
    * The name of the DynamoDB table to crawl.
    */
  var Path: js.UndefOr[typings.awsSdk.glueMod.Path] = js.undefined
  
  /**
    * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a long time when the table is not a high throughput table. A value of true means to scan all records, while a value of false means to sample the records. If no value is specified, the value defaults to true.
    */
  var scanAll: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The percentage of the configured read capacity units to use by the AWS Glue crawler. Read capacity units is a term defined by DynamoDB, and is a numeric value that acts as rate limiter for the number of reads that can be performed on that table per second. The valid values are null or a value between 0.1 to 1.5. A null value is used when user does not provide a value, and defaults to 0.5 of the configured Read Capacity Unit (for provisioned tables), or 0.25 of the max configured Read Capacity Unit (for tables using on-demand mode).
    */
  var scanRate: js.UndefOr[NullableDouble] = js.undefined
}
object DynamoDBTarget {
  
  @scala.inline
  def apply(): DynamoDBTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamoDBTarget]
  }
  
  @scala.inline
  implicit class DynamoDBTargetMutableBuilder[Self <: DynamoDBTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: Path): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setScanAll(value: NullableBoolean): Self = StObject.set(x, "scanAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanAllUndefined: Self = StObject.set(x, "scanAll", js.undefined)
    
    @scala.inline
    def setScanRate(value: NullableDouble): Self = StObject.set(x, "scanRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanRateUndefined: Self = StObject.set(x, "scanRate", js.undefined)
  }
}
