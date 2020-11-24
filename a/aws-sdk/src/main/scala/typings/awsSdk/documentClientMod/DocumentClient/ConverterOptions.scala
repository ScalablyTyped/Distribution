package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConverterOptions extends js.Object {
  
  /**
    * An optional flag indicating that the document client should cast
    * empty strings, buffers, and sets to NULL shapes
    */
  var convertEmptyValues: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to return numbers as a NumberValue object instead of
    * converting them to native JavaScript numbers. This allows for the
    * safe round-trip transport of numbers of arbitrary size.
    */
  var wrapNumbers: js.UndefOr[Boolean] = js.native
}
object ConverterOptions {
  
  @scala.inline
  def apply(): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterOptions]
  }
  
  @scala.inline
  implicit class ConverterOptionsOps[Self <: ConverterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConvertEmptyValues(value: Boolean): Self = this.set("convertEmptyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertEmptyValues: Self = this.set("convertEmptyValues", js.undefined)
    
    @scala.inline
    def setWrapNumbers(value: Boolean): Self = this.set("wrapNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapNumbers: Self = this.set("wrapNumbers", js.undefined)
  }
}
