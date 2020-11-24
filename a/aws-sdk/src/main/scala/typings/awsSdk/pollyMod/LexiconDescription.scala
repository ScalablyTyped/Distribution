package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LexiconDescription extends js.Object {
  
  /**
    * Provides lexicon metadata.
    */
  var Attributes: js.UndefOr[LexiconAttributes] = js.native
  
  /**
    * Name of the lexicon.
    */
  var Name: js.UndefOr[LexiconName] = js.native
}
object LexiconDescription {
  
  @scala.inline
  def apply(): LexiconDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexiconDescription]
  }
  
  @scala.inline
  implicit class LexiconDescriptionOps[Self <: LexiconDescription] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: LexiconAttributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setName(value: LexiconName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
