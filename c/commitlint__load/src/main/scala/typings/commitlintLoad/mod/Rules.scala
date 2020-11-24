package typings.commitlintLoad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rules extends js.Object {
  
  var `body-leading-blank`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
  
  var `body-max-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `body-max-line-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `body-min-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `footer-leading-blank`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
  
  var `footer-max-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `footer-max-line-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `footer-min-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `header-case`: js.UndefOr[Rule[Case]] = js.native
  
  var `header-full-stop`: js.UndefOr[Rule[String]] = js.native
  
  var `header-max-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `header-min-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `references-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
  
  var `scope-case`: js.UndefOr[Rule[Case]] = js.native
  
  var `scope-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
  
  var `scope-enum`: js.UndefOr[Rule[js.Array[String]]] = js.native
  
  var `scope-max-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `scope-min-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `signed-off-by`: js.UndefOr[Rule[String]] = js.native
  
  var `subject-case`: js.UndefOr[Rule[Case | js.Array[Case]]] = js.native
  
  var `subject-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
  
  var `subject-full-stop`: js.UndefOr[Rule[String]] = js.native
  
  var `subject-max-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `subject-min-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `type-case`: js.UndefOr[Rule[Case]] = js.native
  
  var `type-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.native
  
  var `type-enum`: js.UndefOr[Rule[js.Array[String]]] = js.native
  
  var `type-max-length`: js.UndefOr[Rule[Double]] = js.native
  
  var `type-min-length`: js.UndefOr[Rule[Double]] = js.native
}
object Rules {
  
  @scala.inline
  def apply(): Rules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rules]
  }
  
  @scala.inline
  implicit class RulesOps[Self <: Rules] (val x: Self) extends AnyVal {
    
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
    def `setBody-leading-blank`(value: Rule[js.UndefOr[scala.Nothing]]): Self = this.set("body-leading-blank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBody-leading-blank`: Self = this.set("body-leading-blank", js.undefined)
    
    @scala.inline
    def `setBody-max-length`(value: Rule[Double]): Self = this.set("body-max-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBody-max-length`: Self = this.set("body-max-length", js.undefined)
    
    @scala.inline
    def `setBody-max-line-length`(value: Rule[Double]): Self = this.set("body-max-line-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBody-max-line-length`: Self = this.set("body-max-line-length", js.undefined)
    
    @scala.inline
    def `setBody-min-length`(value: Rule[Double]): Self = this.set("body-min-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBody-min-length`: Self = this.set("body-min-length", js.undefined)
    
    @scala.inline
    def `setFooter-leading-blank`(value: Rule[js.UndefOr[scala.Nothing]]): Self = this.set("footer-leading-blank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFooter-leading-blank`: Self = this.set("footer-leading-blank", js.undefined)
    
    @scala.inline
    def `setFooter-max-length`(value: Rule[Double]): Self = this.set("footer-max-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFooter-max-length`: Self = this.set("footer-max-length", js.undefined)
    
    @scala.inline
    def `setFooter-max-line-length`(value: Rule[Double]): Self = this.set("footer-max-line-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFooter-max-line-length`: Self = this.set("footer-max-line-length", js.undefined)
    
    @scala.inline
    def `setFooter-min-length`(value: Rule[Double]): Self = this.set("footer-min-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFooter-min-length`: Self = this.set("footer-min-length", js.undefined)
    
    @scala.inline
    def `setHeader-case`(value: Rule[Case]): Self = this.set("header-case", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHeader-case`: Self = this.set("header-case", js.undefined)
    
    @scala.inline
    def `setHeader-full-stop`(value: Rule[String]): Self = this.set("header-full-stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHeader-full-stop`: Self = this.set("header-full-stop", js.undefined)
    
    @scala.inline
    def `setHeader-max-length`(value: Rule[Double]): Self = this.set("header-max-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHeader-max-length`: Self = this.set("header-max-length", js.undefined)
    
    @scala.inline
    def `setHeader-min-length`(value: Rule[Double]): Self = this.set("header-min-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHeader-min-length`: Self = this.set("header-min-length", js.undefined)
    
    @scala.inline
    def `setReferences-empty`(value: Rule[js.UndefOr[scala.Nothing]]): Self = this.set("references-empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteReferences-empty`: Self = this.set("references-empty", js.undefined)
    
    @scala.inline
    def `setScope-case`(value: Rule[Case]): Self = this.set("scope-case", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScope-case`: Self = this.set("scope-case", js.undefined)
    
    @scala.inline
    def `setScope-empty`(value: Rule[js.UndefOr[scala.Nothing]]): Self = this.set("scope-empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScope-empty`: Self = this.set("scope-empty", js.undefined)
    
    @scala.inline
    def `setScope-enum`(value: Rule[js.Array[String]]): Self = this.set("scope-enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScope-enum`: Self = this.set("scope-enum", js.undefined)
    
    @scala.inline
    def `setScope-max-length`(value: Rule[Double]): Self = this.set("scope-max-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScope-max-length`: Self = this.set("scope-max-length", js.undefined)
    
    @scala.inline
    def `setScope-min-length`(value: Rule[Double]): Self = this.set("scope-min-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteScope-min-length`: Self = this.set("scope-min-length", js.undefined)
    
    @scala.inline
    def `setSigned-off-by`(value: Rule[String]): Self = this.set("signed-off-by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSigned-off-by`: Self = this.set("signed-off-by", js.undefined)
    
    @scala.inline
    def `setSubject-case`(value: Rule[Case | js.Array[Case]]): Self = this.set("subject-case", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSubject-case`: Self = this.set("subject-case", js.undefined)
    
    @scala.inline
    def `setSubject-empty`(value: Rule[js.UndefOr[scala.Nothing]]): Self = this.set("subject-empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSubject-empty`: Self = this.set("subject-empty", js.undefined)
    
    @scala.inline
    def `setSubject-full-stop`(value: Rule[String]): Self = this.set("subject-full-stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSubject-full-stop`: Self = this.set("subject-full-stop", js.undefined)
    
    @scala.inline
    def `setSubject-max-length`(value: Rule[Double]): Self = this.set("subject-max-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSubject-max-length`: Self = this.set("subject-max-length", js.undefined)
    
    @scala.inline
    def `setSubject-min-length`(value: Rule[Double]): Self = this.set("subject-min-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSubject-min-length`: Self = this.set("subject-min-length", js.undefined)
    
    @scala.inline
    def `setType-case`(value: Rule[Case]): Self = this.set("type-case", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteType-case`: Self = this.set("type-case", js.undefined)
    
    @scala.inline
    def `setType-empty`(value: Rule[js.UndefOr[scala.Nothing]]): Self = this.set("type-empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteType-empty`: Self = this.set("type-empty", js.undefined)
    
    @scala.inline
    def `setType-enum`(value: Rule[js.Array[String]]): Self = this.set("type-enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteType-enum`: Self = this.set("type-enum", js.undefined)
    
    @scala.inline
    def `setType-max-length`(value: Rule[Double]): Self = this.set("type-max-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteType-max-length`: Self = this.set("type-max-length", js.undefined)
    
    @scala.inline
    def `setType-min-length`(value: Rule[Double]): Self = this.set("type-min-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteType-min-length`: Self = this.set("type-min-length", js.undefined)
  }
}
