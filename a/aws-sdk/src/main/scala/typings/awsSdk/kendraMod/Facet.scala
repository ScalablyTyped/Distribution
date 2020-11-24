package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Facet extends js.Object {
  
  /**
    * The unique key for the document attribute.
    */
  var DocumentAttributeKey: js.UndefOr[typings.awsSdk.kendraMod.DocumentAttributeKey] = js.native
}
object Facet {
  
  @scala.inline
  def apply(): Facet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Facet]
  }
  
  @scala.inline
  implicit class FacetOps[Self <: Facet] (val x: Self) extends AnyVal {
    
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
    def setDocumentAttributeKey(value: DocumentAttributeKey): Self = this.set("DocumentAttributeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentAttributeKey: Self = this.set("DocumentAttributeKey", js.undefined)
  }
}
