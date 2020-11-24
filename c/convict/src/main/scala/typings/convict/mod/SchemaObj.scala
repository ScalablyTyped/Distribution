package typings.convict.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaObj[T] extends js.Object {
  
  var arg: js.UndefOr[String] = js.native
  
  /**
    * You can define a configuration property as "required" without providing a default value.
    * Set its default to null and if your format doesn't accept null it will throw an error.
    */
  var default: T | Null = js.native
  
  var doc: js.UndefOr[String] = js.native
  
  var env: js.UndefOr[String] = js.native
  
  /**
    * From the implementation:
    *
    *  format can be a:
    *   - predefined type, as seen below
    *   - an array of enumerated values, e.g. ["production", "development", "testing"]
    *   - built-in JavaScript type, i.e. Object, Array, String, Number, Boolean
    *   - function that performs validation and throws an Error on failure
    *
    * If omitted, format will be set to the value of Object.prototype.toString.call
    * for the default value
    */
  var format: js.UndefOr[PredefinedFormat | js.Array[_] | (js.Function1[/* val */ js.Any, Unit])] = js.native
  
  var sensitive: js.UndefOr[Boolean] = js.native
}
object SchemaObj {
  
  @scala.inline
  def apply[T](): SchemaObj[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObj[T]]
  }
  
  @scala.inline
  implicit class SchemaObjOps[Self <: SchemaObj[_], T] (val x: Self with SchemaObj[T]) extends AnyVal {
    
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
    def setArg(value: String): Self = this.set("arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArg: Self = this.set("arg", js.undefined)
    
    @scala.inline
    def setDefault(value: T): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    
    @scala.inline
    def setDoc(value: String): Self = this.set("doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoc: Self = this.set("doc", js.undefined)
    
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setFormatVarargs(value: js.Any*): Self = this.set("format", js.Array(value :_*))
    
    @scala.inline
    def setFormatFunction1(value: /* val */ js.Any => Unit): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: PredefinedFormat | js.Array[_] | (js.Function1[/* val */ js.Any, Unit])): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setSensitive(value: Boolean): Self = this.set("sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitive: Self = this.set("sensitive", js.undefined)
  }
}
