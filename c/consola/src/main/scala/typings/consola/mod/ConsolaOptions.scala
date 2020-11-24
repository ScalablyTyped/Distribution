package typings.consola.mod

import typings.consola.anon.typeinlogTypeConsolaLogOb
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsolaOptions extends js.Object {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var defaults: js.UndefOr[ConsolaLogObject] = js.native
  
  var level: js.UndefOr[LogLevel] = js.native
  
  var mockFn: js.UndefOr[ConsolaMockFn] = js.native
  
  var reporters: js.UndefOr[js.Array[ConsolaReporter]] = js.native
  
  var stderr: js.UndefOr[WritableStream] = js.native
  
  var stdout: js.UndefOr[WritableStream] = js.native
  
  var throttle: js.UndefOr[Double] = js.native
  
  var types: js.UndefOr[typeinlogTypeConsolaLogOb] = js.native
}
object ConsolaOptions {
  
  @scala.inline
  def apply(): ConsolaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsolaOptions]
  }
  
  @scala.inline
  implicit class ConsolaOptionsOps[Self <: ConsolaOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setDefaults(value: ConsolaLogObject): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setLevel(value: LogLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMockFn(value: (/* type */ logType, /* defaults */ ConsolaLogObject) => ConsolaMock): Self = this.set("mockFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMockFn: Self = this.set("mockFn", js.undefined)
    
    @scala.inline
    def setReportersVarargs(value: ConsolaReporter*): Self = this.set("reporters", js.Array(value :_*))
    
    @scala.inline
    def setReporters(value: js.Array[ConsolaReporter]): Self = this.set("reporters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporters: Self = this.set("reporters", js.undefined)
    
    @scala.inline
    def setStderr(value: WritableStream): Self = this.set("stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    
    @scala.inline
    def setStdout(value: WritableStream): Self = this.set("stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    
    @scala.inline
    def setTypes(value: typeinlogTypeConsolaLogOb): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
