package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends StObject {
  
  /**
    * The state of the crawler to which this condition applies.
    */
  var CrawlState: js.UndefOr[typings.awsSdk.glueMod.CrawlState] = js.native
  
  /**
    * The name of the crawler to which this condition applies.
    */
  var CrawlerName: js.UndefOr[NameString] = js.native
  
  /**
    * The name of the job whose JobRuns this condition applies to, and on which this trigger waits.
    */
  var JobName: js.UndefOr[NameString] = js.native
  
  /**
    * A logical operator.
    */
  var LogicalOperator: js.UndefOr[typings.awsSdk.glueMod.LogicalOperator] = js.native
  
  /**
    * The condition state. Currently, the only job states that a trigger can listen for are SUCCEEDED, STOPPED, FAILED, and TIMEOUT. The only crawler states that a trigger can listen for are SUCCEEDED, FAILED, and CANCELLED.
    */
  var State: js.UndefOr[JobRunState] = js.native
}
object Condition {
  
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawlState(value: CrawlState): Self = StObject.set(x, "CrawlState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlStateUndefined: Self = StObject.set(x, "CrawlState", js.undefined)
    
    @scala.inline
    def setCrawlerName(value: NameString): Self = StObject.set(x, "CrawlerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlerNameUndefined: Self = StObject.set(x, "CrawlerName", js.undefined)
    
    @scala.inline
    def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setLogicalOperator(value: LogicalOperator): Self = StObject.set(x, "LogicalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalOperatorUndefined: Self = StObject.set(x, "LogicalOperator", js.undefined)
    
    @scala.inline
    def setState(value: JobRunState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
