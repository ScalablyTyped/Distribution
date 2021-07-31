package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE
import typings.cadesplugin.CAPICOM.Certificates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CadesSignedData> */
trait CadesSignedDataAsync extends StObject {
  
  val Certificates: (// tslint:disable-line ban-types
  js.Promise[Unpacked[typings.cadesplugin.CAPICOM.Certificates]]) | PromisifiedFunction[typings.cadesplugin.CAPICOM.Certificates]
  
  val Content: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  val ContentEncoding: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]
  
  val Display: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
    ]
  ]) | (PromisifiedFunction[
    js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
  ])
  
  val DisplayData: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_DISPLAY_DATA]]]) | PromisifiedFunction[ValuesOf[CADESCOM_DISPLAY_DATA]]
  
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
  ])
  
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
  ])
  
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
  ])
  
  def propset_Content(content: String): js.Promise[Unit]
  
  def propset_ContentEncoding(contentEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]): js.Promise[Unit]
  
  def propset_DisplayData(displayData: ValuesOf[CADESCOM_DISPLAY_DATA]): js.Promise[Unit]
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
  implicit class CadesSignedDataAsyncMutableBuilder[Self <: CadesSignedDataAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Certificates]]) | PromisifiedFunction[Certificates]
    ): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Certificates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContent(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncoding(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]
    ): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncodingFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "ContentEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Content", js.Any.fromFunction1(value))
    
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
    ): Self = StObject.set(x, "Display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayData(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CADESCOM_DISPLAY_DATA]]]) | PromisifiedFunction[ValuesOf[CADESCOM_DISPLAY_DATA]]
    ): Self = StObject.set(x, "DisplayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDataFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "DisplayData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Display", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayFunction2(value: (/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "Display", js.Any.fromFunction2(value))
    
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
    ): Self = StObject.set(x, "EnhanceCades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhanceCadesFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "EnhanceCades", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnhanceCadesFunction3(
      value: (/* cadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], /* TSAAddress */ js.UndefOr[String], /* encodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]]) => String
    ): Self = StObject.set(x, "EnhanceCades", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPropset_Content(value: String => js.Promise[Unit]): Self = StObject.set(x, "propset_Content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_ContentEncoding(value: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] => js.Promise[Unit]): Self = StObject.set(x, "propset_ContentEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_DisplayData(value: ValuesOf[CADESCOM_DISPLAY_DATA] => js.Promise[Unit]): Self = StObject.set(x, "propset_DisplayData", js.Any.fromFunction1(value))
    
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
    ): Self = StObject.set(x, "SignCades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignCadesFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "SignCades", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignCadesFunction4(
      value: (/* signer */ js.UndefOr[CPSigner], /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], /* bDetached */ js.UndefOr[Boolean], /* EncodingType */ js.UndefOr[ValuesOf[CAPICOM_ENCODING_TYPE]]) => String
    ): Self = StObject.set(x, "SignCades", js.Any.fromFunction4(value))
    
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
    ): Self = StObject.set(x, "VerifyCades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyCadesFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "VerifyCades", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerifyCadesFunction3(
      value: (/* SignedMessage */ String, /* CadesType */ js.UndefOr[ValuesOf[CADESCOM_CADES_TYPE]], /* bDetached */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "VerifyCades", js.Any.fromFunction3(value))
  }
}
