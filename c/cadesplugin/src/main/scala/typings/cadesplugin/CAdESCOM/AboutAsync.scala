package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.About> */
@js.native
trait AboutAsync extends StObject {
  
  val BuildVersion: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double] = js.native
  
  val CSPName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* ProviderType */ js.UndefOr[Double], String]]]) | (PromisifiedFunction[js.Function1[/* ProviderType */ js.UndefOr[Double], String]]) = js.native
  
  val CSPVersion: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function2[
        /* ProviderName */ js.UndefOr[String], 
        /* ProviderType */ js.UndefOr[Double], 
        typings.cadesplugin.CAdESCOM.Version
      ]
    ]
  ]) | (PromisifiedFunction[
    js.Function2[
      /* ProviderName */ js.UndefOr[String], 
      /* ProviderType */ js.UndefOr[Double], 
      typings.cadesplugin.CAdESCOM.Version
    ]
  ]) = js.native
  
  val MajorVersion: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double] = js.native
  
  val MinorVersion: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double] = js.native
  
  val PluginVersion: (// tslint:disable-line ban-types
  js.Promise[Unpacked[typings.cadesplugin.CAdESCOM.Version]]) | PromisifiedFunction[typings.cadesplugin.CAdESCOM.Version] = js.native
  
  val ProviderVersion: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function2[/* ProviderName */ js.UndefOr[String], /* ProviderType */ js.UndefOr[Double], String]
    ]
  ]) | (PromisifiedFunction[
    js.Function2[/* ProviderName */ js.UndefOr[String], /* ProviderType */ js.UndefOr[Double], String]
  ]) = js.native
  
  val Version: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  @JSName("toString")
  val toString_FAboutAsync: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[String]]]) | PromisifiedFunction[js.Function0[String]] = js.native
}
object AboutAsync {
  
  @scala.inline
  def apply(
    BuildVersion: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double],
    CSPName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* ProviderType */ js.UndefOr[Double], String]]]) | (PromisifiedFunction[js.Function1[/* ProviderType */ js.UndefOr[Double], String]]),
    CSPVersion: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function2[
          /* ProviderName */ js.UndefOr[String], 
          /* ProviderType */ js.UndefOr[Double], 
          Version
        ]
      ]
    ]) | (PromisifiedFunction[
      js.Function2[
        /* ProviderName */ js.UndefOr[String], 
        /* ProviderType */ js.UndefOr[Double], 
        Version
      ]
    ]),
    MajorVersion: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double],
    MinorVersion: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double],
    PluginVersion: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Version]]) | PromisifiedFunction[Version],
    ProviderVersion: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function2[/* ProviderName */ js.UndefOr[String], /* ProviderType */ js.UndefOr[Double], String]
      ]
    ]) | (PromisifiedFunction[
      js.Function2[/* ProviderName */ js.UndefOr[String], /* ProviderType */ js.UndefOr[Double], String]
    ]),
    Version: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    toString_ : (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[String]]]) | PromisifiedFunction[js.Function0[String]]
  ): AboutAsync = {
    val __obj = js.Dynamic.literal(BuildVersion = BuildVersion.asInstanceOf[js.Any], CSPName = CSPName.asInstanceOf[js.Any], CSPVersion = CSPVersion.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], PluginVersion = PluginVersion.asInstanceOf[js.Any], ProviderVersion = ProviderVersion.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboutAsync]
  }
  
  @scala.inline
  implicit class AboutAsyncMutableBuilder[Self <: AboutAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildVersion(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = StObject.set(x, "BuildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildVersionFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "BuildVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCSPName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* ProviderType */ js.UndefOr[Double], String]]]) | (PromisifiedFunction[js.Function1[/* ProviderType */ js.UndefOr[Double], String]])
    ): Self = StObject.set(x, "CSPName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSPNameFunction1(
      value: js.UndefOr[
          (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any]) | Double
        ] => js.Promise[Unpacked[js.Any]] | String
    ): Self = StObject.set(x, "CSPName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCSPVersion(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function2[
              /* ProviderName */ js.UndefOr[String], 
              /* ProviderType */ js.UndefOr[Double], 
              Version
            ]
          ]
        ]) | (PromisifiedFunction[
          js.Function2[
            /* ProviderName */ js.UndefOr[String], 
            /* ProviderType */ js.UndefOr[Double], 
            Version
          ]
        ])
    ): Self = StObject.set(x, "CSPVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSPVersionFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "CSPVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCSPVersionFunction2(value: (/* ProviderName */ js.UndefOr[String], /* ProviderType */ js.UndefOr[Double]) => Version): Self = StObject.set(x, "CSPVersion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMajorVersion(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = StObject.set(x, "MajorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersionFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "MajorVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinorVersion(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = StObject.set(x, "MinorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorVersionFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "MinorVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPluginVersion(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Version]]) | PromisifiedFunction[Version]
    ): Self = StObject.set(x, "PluginVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginVersionFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "PluginVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProviderVersion(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function2[/* ProviderName */ js.UndefOr[String], /* ProviderType */ js.UndefOr[Double], String]
          ]
        ]) | (PromisifiedFunction[
          js.Function2[/* ProviderName */ js.UndefOr[String], /* ProviderType */ js.UndefOr[Double], String]
        ])
    ): Self = StObject.set(x, "ProviderVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderVersionFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "ProviderVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProviderVersionFunction2(value: (/* ProviderName */ js.UndefOr[String], /* ProviderType */ js.UndefOr[Double]) => String): Self = StObject.set(x, "ProviderVersion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToString_(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[String]]]) | PromisifiedFunction[js.Function0[String]]
    ): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToString_Function0(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString_Function1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersion(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Version", js.Any.fromFunction1(value))
  }
}
