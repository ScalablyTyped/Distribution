package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CAPICOM.Signers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.SignedXML> */
@js.native
trait SignedXMLAsync extends js.Object {
  
  val Content: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  val DigestMethod: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  val Sign: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function2[/* signer */ js.UndefOr[CPSigner], /* XPath */ js.UndefOr[String], String]
    ]
  ]) | (PromisifiedFunction[
    js.Function2[/* signer */ js.UndefOr[CPSigner], /* XPath */ js.UndefOr[String], String]
  ]) = js.native
  
  val SignatureMethod: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  val SignatureType: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_XML_SIGNATURE_TYPE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_XML_SIGNATURE_TYPE]] = js.native
  
  val Signers: (// tslint:disable-line ban-types
  js.Promise[Unpacked[typings.cadesplugin.CAPICOM.Signers]]) | PromisifiedFunction[typings.cadesplugin.CAPICOM.Signers] = js.native
  
  val Verify: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[js.Function2[/* SignedMessage */ String, /* XPath */ js.UndefOr[String], Unit]]
  ]) | (PromisifiedFunction[js.Function2[/* SignedMessage */ String, /* XPath */ js.UndefOr[String], Unit]]) = js.native
  
  def propset_Content(content: String): js.Promise[Unit] = js.native
  
  def propset_DigestMethod(digestMethod: String): js.Promise[Unit] = js.native
  
  def propset_SignatureMethod(signatureMethod: String): js.Promise[Unit] = js.native
  
  def propset_SignatureType(signatureType: ValuesOf[CADESCOM_XML_SIGNATURE_TYPE]): js.Promise[Unit] = js.native
}
object SignedXMLAsync {
  
  @scala.inline
  def apply(
    Content: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    DigestMethod: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    Sign: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function2[/* signer */ js.UndefOr[CPSigner], /* XPath */ js.UndefOr[String], String]
      ]
    ]) | (PromisifiedFunction[
      js.Function2[/* signer */ js.UndefOr[CPSigner], /* XPath */ js.UndefOr[String], String]
    ]),
    SignatureMethod: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    SignatureType: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_XML_SIGNATURE_TYPE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_XML_SIGNATURE_TYPE]],
    Signers: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Signers]]) | PromisifiedFunction[Signers],
    Verify: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[js.Function2[/* SignedMessage */ String, /* XPath */ js.UndefOr[String], Unit]]
    ]) | (PromisifiedFunction[js.Function2[/* SignedMessage */ String, /* XPath */ js.UndefOr[String], Unit]]),
    propset_Content: String => js.Promise[Unit],
    propset_DigestMethod: String => js.Promise[Unit],
    propset_SignatureMethod: String => js.Promise[Unit],
    propset_SignatureType: ValuesOf[CADESCOM_XML_SIGNATURE_TYPE] => js.Promise[Unit]
  ): SignedXMLAsync = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], DigestMethod = DigestMethod.asInstanceOf[js.Any], Sign = Sign.asInstanceOf[js.Any], SignatureMethod = SignatureMethod.asInstanceOf[js.Any], SignatureType = SignatureType.asInstanceOf[js.Any], Signers = Signers.asInstanceOf[js.Any], Verify = Verify.asInstanceOf[js.Any], propset_Content = js.Any.fromFunction1(propset_Content), propset_DigestMethod = js.Any.fromFunction1(propset_DigestMethod), propset_SignatureMethod = js.Any.fromFunction1(propset_SignatureMethod), propset_SignatureType = js.Any.fromFunction1(propset_SignatureType))
    __obj.asInstanceOf[SignedXMLAsync]
  }
  
  @scala.inline
  implicit class SignedXMLAsyncOps[Self <: SignedXMLAsync] (val x: Self) extends AnyVal {
    
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
    def setContentFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContent(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestMethodFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("DigestMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDigestMethod(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = this.set("DigestMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignFunction2(value: (/* signer */ js.UndefOr[CPSigner], /* XPath */ js.UndefOr[String]) => String): Self = this.set("Sign", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSignFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Sign", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSign(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function2[/* signer */ js.UndefOr[CPSigner], /* XPath */ js.UndefOr[String], String]
          ]
        ]) | (PromisifiedFunction[
          js.Function2[/* signer */ js.UndefOr[CPSigner], /* XPath */ js.UndefOr[String], String]
        ])
    ): Self = this.set("Sign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureMethodFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("SignatureMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignatureMethod(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = this.set("SignatureMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureTypeFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("SignatureType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignatureType(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CADESCOM_XML_SIGNATURE_TYPE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_XML_SIGNATURE_TYPE]]
    ): Self = this.set("SignatureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignersFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Signers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSigners(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Signers]]) | PromisifiedFunction[Signers]
    ): Self = this.set("Signers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyFunction2(value: (/* SignedMessage */ String, /* XPath */ js.UndefOr[String]) => Unit): Self = this.set("Verify", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVerifyFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Verify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerify(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[js.Function2[/* SignedMessage */ String, /* XPath */ js.UndefOr[String], Unit]]
        ]) | (PromisifiedFunction[js.Function2[/* SignedMessage */ String, /* XPath */ js.UndefOr[String], Unit]])
    ): Self = this.set("Verify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropset_Content(value: String => js.Promise[Unit]): Self = this.set("propset_Content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_DigestMethod(value: String => js.Promise[Unit]): Self = this.set("propset_DigestMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_SignatureMethod(value: String => js.Promise[Unit]): Self = this.set("propset_SignatureMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_SignatureType(value: ValuesOf[CADESCOM_XML_SIGNATURE_TYPE] => js.Promise[Unit]): Self = this.set("propset_SignatureType", js.Any.fromFunction1(value))
  }
}
