package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Statistics extends js.Object {
  
  /**
    * The approximate number of objects that the job has yet to process during its current run.
    */
  var approximateNumberOfObjectsToProcess: js.UndefOr[double] = js.native
  
  /**
    * The number of times that the job has run.
    */
  var numberOfRuns: js.UndefOr[double] = js.native
}
object Statistics {
  
  @scala.inline
  def apply(): Statistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statistics]
  }
  
  @scala.inline
  implicit class StatisticsOps[Self <: Statistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApproximateNumberOfObjectsToProcess(value: double): Self = this.set("approximateNumberOfObjectsToProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproximateNumberOfObjectsToProcess: Self = this.set("approximateNumberOfObjectsToProcess", js.undefined)
    
    @scala.inline
    def setNumberOfRuns(value: double): Self = this.set("numberOfRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfRuns: Self = this.set("numberOfRuns", js.undefined)
  }
}
