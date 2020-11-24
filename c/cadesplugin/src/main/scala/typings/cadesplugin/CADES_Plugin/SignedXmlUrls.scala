package typings.cadesplugin.CADES_Plugin

import typings.cadesplugin.cadespluginStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr34102001-gostr3411`
import typings.cadesplugin.cadespluginStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr3411`
import typings.cadesplugin.cadespluginStrings.`urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34102001-gostr3411`
import typings.cadesplugin.cadespluginStrings.urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr3411
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedXmlUrls extends js.Object {
  
  val XmlDsigGost3410Url: `urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34102001-gostr3411` = js.native
  
  val XmlDsigGost3410UrlObsolete: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr34102001-gostr3411` = js.native
  
  val XmlDsigGost3411Url: urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr3411 = js.native
  
  val XmlDsigGost3411UrlObsolete: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr3411` = js.native
}
object SignedXmlUrls {
  
  @scala.inline
  def apply(
    XmlDsigGost3410Url: `urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34102001-gostr3411`,
    XmlDsigGost3410UrlObsolete: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr34102001-gostr3411`,
    XmlDsigGost3411Url: urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr3411,
    XmlDsigGost3411UrlObsolete: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr3411`
  ): SignedXmlUrls = {
    val __obj = js.Dynamic.literal(XmlDsigGost3410Url = XmlDsigGost3410Url.asInstanceOf[js.Any], XmlDsigGost3410UrlObsolete = XmlDsigGost3410UrlObsolete.asInstanceOf[js.Any], XmlDsigGost3411Url = XmlDsigGost3411Url.asInstanceOf[js.Any], XmlDsigGost3411UrlObsolete = XmlDsigGost3411UrlObsolete.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedXmlUrls]
  }
  
  @scala.inline
  implicit class SignedXmlUrlsOps[Self <: SignedXmlUrls] (val x: Self) extends AnyVal {
    
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
    def setXmlDsigGost3410Url(
      value: `urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr34102001-gostr3411`
    ): Self = this.set("XmlDsigGost3410Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlDsigGost3410UrlObsolete(
      value: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr34102001-gostr3411`
    ): Self = this.set("XmlDsigGost3410UrlObsolete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlDsigGost3411Url(value: urnColonietfColonparamsColonxmlColonnsColoncpxmlsecColonalgorithmsColongostr3411): Self = this.set("XmlDsigGost3411Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlDsigGost3411UrlObsolete(value: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersigngostr3411`): Self = this.set("XmlDsigGost3411UrlObsolete", value.asInstanceOf[js.Any])
  }
}
