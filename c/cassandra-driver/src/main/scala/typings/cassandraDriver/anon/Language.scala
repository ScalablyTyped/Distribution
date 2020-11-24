package typings.cassandraDriver.anon

import typings.cassandraDriver.typesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Language extends js.Object {
  
  var language: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var readConsistency: js.UndefOr[consistencies] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var writeConsistency: js.UndefOr[consistencies] = js.native
}
object Language {
  
  @scala.inline
  def apply(): Language = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Language]
  }
  
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReadConsistency(value: consistencies): Self = this.set("readConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadConsistency: Self = this.set("readConsistency", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setWriteConsistency(value: consistencies): Self = this.set("writeConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteConsistency: Self = this.set("writeConsistency", js.undefined)
  }
}
