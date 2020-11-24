package typings.cassandraDriver.concurrentMod.concurrent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var collectResults: js.UndefOr[Boolean] = js.native
  
  var concurrencyLevel: js.UndefOr[Double] = js.native
  
  var executionProfile: js.UndefOr[String] = js.native
  
  var maxErrors: js.UndefOr[Double] = js.native
  
  var raiseOnFirstError: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCollectResults(value: Boolean): Self = this.set("collectResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectResults: Self = this.set("collectResults", js.undefined)
    
    @scala.inline
    def setConcurrencyLevel(value: Double): Self = this.set("concurrencyLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrencyLevel: Self = this.set("concurrencyLevel", js.undefined)
    
    @scala.inline
    def setExecutionProfile(value: String): Self = this.set("executionProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionProfile: Self = this.set("executionProfile", js.undefined)
    
    @scala.inline
    def setMaxErrors(value: Double): Self = this.set("maxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxErrors: Self = this.set("maxErrors", js.undefined)
    
    @scala.inline
    def setRaiseOnFirstError(value: Boolean): Self = this.set("raiseOnFirstError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaiseOnFirstError: Self = this.set("raiseOnFirstError", js.undefined)
  }
}
