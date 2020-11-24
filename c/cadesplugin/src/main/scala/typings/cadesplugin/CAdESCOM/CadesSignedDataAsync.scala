package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE
import typings.cadesplugin.CAPICOM.Certificates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CadesSignedData> */
@js.native
trait CadesSignedDataAsync extends js.Object {
  
  val Certificates: (// tslint:disable-line ban-types
  js.Promise[Unpacked[typings.cadesplugin.CAPICOM.Certificates]]) | PromisifiedFunction[typings.cadesplugin.CAPICOM.Certificates] = js.native
  
  val Content: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  val ContentEncoding: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]] = js.native
  
  val Display: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
    ]
  ]) | (PromisifiedFunction[
    js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
  ]) = js.native
  
  val DisplayData: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_DISPLAY_DATA]]]) | PromisifiedFunction[ValuesOf[CADESCOM_DISPLAY_DATA]] = js.native
  
  val EnhanceCades: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function3[
        /* cadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
        /* TSAAddress */ js.UndefOr[String], 
        /* encodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]], 
        String
      ]
    ]
  ]) | (PromisifiedFunction[
    js.Function3[
      /* cadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
      /* TSAAddress */ js.UndefOr[String], 
      /* encodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]], 
      String
    ]
  ]) = js.native
  
  val SignCades: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function4[
        /* signer */ js.UndefOr[CPSigner], 
        /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
        /* bDetached */ js.UndefOr[Boolean], 
        /* EncodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]], 
        String
      ]
    ]
  ]) | (PromisifiedFunction[
    js.Function4[
      /* signer */ js.UndefOr[CPSigner], 
      /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
      /* bDetached */ js.UndefOr[Boolean], 
      /* EncodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]], 
      String
    ]
  ]) = js.native
  
  val VerifyCades: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function3[
        /* SignedMessage */ String, 
        /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
        /* bDetached */ js.UndefOr[Boolean], 
        Unit
      ]
    ]
  ]) | (PromisifiedFunction[
    js.Function3[
      /* SignedMessage */ String, 
      /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
      /* bDetached */ js.UndefOr[Boolean], 
      Unit
    ]
  ]) = js.native
  
  def propset_Content(content: String): js.Promise[Unit] = js.native
  
  def propset_ContentEncoding(contentEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]): js.Promise[Unit] = js.native
  
  def propset_DisplayData(displayData: ValuesOf[CADESCOM_DISPLAY_DATA]): js.Promise[Unit] = js.native
}
object CadesSignedDataAsync {
  
  @scala.inline
  def apply(
    Certificates: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Certificates]]) | PromisifiedFunction[Certificates],
    Content: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    ContentEncoding: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]],
    Display: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
      ]
    ]) | (PromisifiedFunction[
      js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
    ]),
    DisplayData: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_DISPLAY_DATA]]]) | PromisifiedFunction[ValuesOf[CADESCOM_DISPLAY_DATA]],
    EnhanceCades: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function3[
          /* cadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
          /* TSAAddress */ js.UndefOr[String], 
          /* encodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]], 
          String
        ]
      ]
    ]) | (PromisifiedFunction[
      js.Function3[
        /* cadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
        /* TSAAddress */ js.UndefOr[String], 
        /* encodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]], 
        String
      ]
    ]),
    SignCades: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function4[
          /* signer */ js.UndefOr[CPSigner], 
          /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
          /* bDetached */ js.UndefOr[Boolean], 
          /* EncodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]], 
          String
        ]
      ]
    ]) | (PromisifiedFunction[
      js.Function4[
        /* signer */ js.UndefOr[CPSigner], 
        /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
        /* bDetached */ js.UndefOr[Boolean], 
        /* EncodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]], 
        String
      ]
    ]),
    VerifyCades: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function3[
          /* SignedMessage */ String, 
          /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
          /* bDetached */ js.UndefOr[Boolean], 
          Unit
        ]
      ]
    ]) | (PromisifiedFunction[
      js.Function3[
        /* SignedMessage */ String, 
        /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
        /* bDetached */ js.UndefOr[Boolean], 
        Unit
      ]
    ]),
    propset_Content: String => js.Promise[Unit],
    propset_ContentEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] => js.Promise[Unit],
    propset_DisplayData: ValuesOf[CADESCOM_DISPLAY_DATA] => js.Promise[Unit]
  ): CadesSignedDataAsync = {
    val __obj = js.Dynamic.literal(Certificates = Certificates.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], ContentEncoding = ContentEncoding.asInstanceOf[js.Any], Display = Display.asInstanceOf[js.Any], DisplayData = DisplayData.asInstanceOf[js.Any], EnhanceCades = EnhanceCades.asInstanceOf[js.Any], SignCades = SignCades.asInstanceOf[js.Any], VerifyCades = VerifyCades.asInstanceOf[js.Any], propset_Content = js.Any.fromFunction1(propset_Content), propset_ContentEncoding = js.Any.fromFunction1(propset_ContentEncoding), propset_DisplayData = js.Any.fromFunction1(propset_DisplayData))
    __obj.asInstanceOf[CadesSignedDataAsync]
  }
  
  @scala.inline
  implicit class CadesSignedDataAsyncOps[Self <: CadesSignedDataAsync] (val x: Self) extends AnyVal {
    
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
    def setCertificatesFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Certificates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCertificates(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Certificates]]) | PromisifiedFunction[Certificates]
    ): Self = this.set("Certificates", value.asInstanceOf[js.Any])
    
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
    def setContentEncodingFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("ContentEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentEncoding(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]
    ): Self = this.set("ContentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFunction2(value: (/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String]) => Unit): Self = this.set("Display", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDisplayFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Display", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplay(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
          ]
        ]) | (PromisifiedFunction[
          js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
        ])
    ): Self = this.set("Display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDataFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("DisplayData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayData(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CADESCOM_DISPLAY_DATA]]]) | PromisifiedFunction[ValuesOf[CADESCOM_DISPLAY_DATA]]
    ): Self = this.set("DisplayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhanceCadesFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("EnhanceCades", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnhanceCadesFunction3(
      value: (/* cadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], /* TSAAddress */ js.UndefOr[String], /* encodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]]) => String
    ): Self = this.set("EnhanceCades", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnhanceCades(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function3[
              /* cadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
              /* TSAAddress */ js.UndefOr[String], 
              /* encodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]], 
              String
            ]
          ]
        ]) | (PromisifiedFunction[
          js.Function3[
            /* cadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
            /* TSAAddress */ js.UndefOr[String], 
            /* encodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]], 
            String
          ]
        ])
    ): Self = this.set("EnhanceCades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignCadesFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("SignCades", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignCadesFunction4(
      value: (/* signer */ js.UndefOr[CPSigner], /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], /* bDetached */ js.UndefOr[Boolean], /* EncodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]]) => String
    ): Self = this.set("SignCades", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSignCades(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function4[
              /* signer */ js.UndefOr[CPSigner], 
              /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
              /* bDetached */ js.UndefOr[Boolean], 
              /* EncodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]], 
              String
            ]
          ]
        ]) | (PromisifiedFunction[
          js.Function4[
            /* signer */ js.UndefOr[CPSigner], 
            /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
            /* bDetached */ js.UndefOr[Boolean], 
            /* EncodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]], 
            String
          ]
        ])
    ): Self = this.set("SignCades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyCadesFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("VerifyCades", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerifyCadesFunction3(
      value: (/* SignedMessage */ String, /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], /* bDetached */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("VerifyCades", js.Any.fromFunction3(value))
    
    @scala.inline
    def setVerifyCades(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function3[
              /* SignedMessage */ String, 
              /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
              /* bDetached */ js.UndefOr[Boolean], 
              Unit
            ]
          ]
        ]) | (PromisifiedFunction[
          js.Function3[
            /* SignedMessage */ String, 
            /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], 
            /* bDetached */ js.UndefOr[Boolean], 
            Unit
          ]
        ])
    ): Self = this.set("VerifyCades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropset_Content(value: String => js.Promise[Unit]): Self = this.set("propset_Content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_ContentEncoding(value: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] => js.Promise[Unit]): Self = this.set("propset_ContentEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_DisplayData(value: ValuesOf[CADESCOM_DISPLAY_DATA] => js.Promise[Unit]): Self = this.set("propset_DisplayData", js.Any.fromFunction1(value))
  }
}
