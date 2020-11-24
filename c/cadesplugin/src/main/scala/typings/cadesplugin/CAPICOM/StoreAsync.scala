package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon.ValuesOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.Store> */
@js.native
trait StoreAsync extends js.Object {
  
  val Certificates: (// tslint:disable-line ban-types
  js.Promise[Unpacked[typings.cadesplugin.CAPICOM.Certificates]]) | PromisifiedFunction[typings.cadesplugin.CAPICOM.Certificates] = js.native
  
  val Close: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]] = js.native
  
  val Delete: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]] = js.native
  
  val Import: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* encodedStore */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* encodedStore */ String, Unit]]) = js.native
  
  val Location: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_STORE_LOCATION]]]) | PromisifiedFunction[ValuesOf[CAPICOM_STORE_LOCATION]] = js.native
  
  val Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  val Open: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function3[
        /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
        /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
        /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
        Unit
      ]
    ]
  ]) | (PromisifiedFunction[
    js.Function3[
      /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
      /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
      /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
      Unit
    ]
  ]) = js.native
}
object StoreAsync {
  
  @scala.inline
  def apply(
    Certificates: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Certificates]]) | PromisifiedFunction[Certificates],
    Close: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]],
    Delete: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]],
    Import: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* encodedStore */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* encodedStore */ String, Unit]]),
    Location: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_STORE_LOCATION]]]) | PromisifiedFunction[ValuesOf[CAPICOM_STORE_LOCATION]],
    Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    Open: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function3[
          /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
          /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
          /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
          Unit
        ]
      ]
    ]) | (PromisifiedFunction[
      js.Function3[
        /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
        /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
        /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
        Unit
      ]
    ])
  ): StoreAsync = {
    val __obj = js.Dynamic.literal(Certificates = Certificates.asInstanceOf[js.Any], Close = Close.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any], Import = Import.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Open = Open.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreAsync]
  }
  
  @scala.inline
  implicit class StoreAsyncOps[Self <: StoreAsync] (val x: Self) extends AnyVal {
    
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
    def setCloseFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseFunction0(value: () => Unit): Self = this.set("Close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]]
    ): Self = this.set("Close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteFunction0(value: () => Boolean): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]]
    ): Self = this.set("Delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any]) | (/* encodedStore */ String) => js.Promise[Unpacked[js.Any]] | Unit
    ): Self = this.set("Import", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImport(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* encodedStore */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* encodedStore */ String, Unit]])
    ): Self = this.set("Import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Location", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocation(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CAPICOM_STORE_LOCATION]]]) | PromisifiedFunction[ValuesOf[CAPICOM_STORE_LOCATION]]
    ): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenFunction3(
      value: (/* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]]) => Unit
    ): Self = this.set("Open", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOpen(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function3[
              /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
              /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
              /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
              Unit
            ]
          ]
        ]) | (PromisifiedFunction[
          js.Function3[
            /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
            /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
            /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
            Unit
          ]
        ])
    ): Self = this.set("Open", value.asInstanceOf[js.Any])
  }
}
