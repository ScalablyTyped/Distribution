package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CADESCommon._Unpacked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.Certificates> */
@js.native
trait CertificatesAsync
  extends _Unpacked[js.Any] {
  
  val Count: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double] = js.native
  
  val Find: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function3[
        /* findType */ ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], 
        /* varCriteria */ js.UndefOr[_], 
        /* bFindValidOnly */ js.UndefOr[Boolean], 
        Certificates
      ]
    ]
  ]) | (PromisifiedFunction[
    js.Function3[
      /* findType */ ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], 
      /* varCriteria */ js.UndefOr[_], 
      /* bFindValidOnly */ js.UndefOr[Boolean], 
      Certificates
    ]
  ]) = js.native
  
  val Item: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* index */ Double, Certificate]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, Certificate]]) = js.native
  
  val Select: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function3[
        /* title */ js.UndefOr[String], 
        /* displayString */ js.UndefOr[String], 
        /* bMultiSelect */ js.UndefOr[Boolean], 
        Certificates
      ]
    ]
  ]) | (PromisifiedFunction[
    js.Function3[
      /* title */ js.UndefOr[String], 
      /* displayString */ js.UndefOr[String], 
      /* bMultiSelect */ js.UndefOr[Boolean], 
      Certificates
    ]
  ]) = js.native
}
object CertificatesAsync {
  
  @scala.inline
  def apply(
    Count: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double],
    Find: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function3[
          /* findType */ ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], 
          /* varCriteria */ js.UndefOr[_], 
          /* bFindValidOnly */ js.UndefOr[Boolean], 
          Certificates
        ]
      ]
    ]) | (PromisifiedFunction[
      js.Function3[
        /* findType */ ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], 
        /* varCriteria */ js.UndefOr[_], 
        /* bFindValidOnly */ js.UndefOr[Boolean], 
        Certificates
      ]
    ]),
    Item: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* index */ Double, Certificate]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, Certificate]]),
    Select: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function3[
          /* title */ js.UndefOr[String], 
          /* displayString */ js.UndefOr[String], 
          /* bMultiSelect */ js.UndefOr[Boolean], 
          Certificates
        ]
      ]
    ]) | (PromisifiedFunction[
      js.Function3[
        /* title */ js.UndefOr[String], 
        /* displayString */ js.UndefOr[String], 
        /* bMultiSelect */ js.UndefOr[Boolean], 
        Certificates
      ]
    ])
  ): CertificatesAsync = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Find = Find.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Select = Select.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificatesAsync]
  }
  
  @scala.inline
  implicit class CertificatesAsyncOps[Self <: CertificatesAsync] (val x: Self) extends AnyVal {
    
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
    def setCountFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Count", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindFunction3(
      value: (/* findType */ ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], /* varCriteria */ js.UndefOr[_], /* bFindValidOnly */ js.UndefOr[Boolean]) => Certificates
    ): Self = this.set("Find", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFind(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function3[
              /* findType */ ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], 
              /* varCriteria */ js.UndefOr[_], 
              /* bFindValidOnly */ js.UndefOr[Boolean], 
              Certificates
            ]
          ]
        ]) | (PromisifiedFunction[
          js.Function3[
            /* findType */ ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], 
            /* varCriteria */ js.UndefOr[_], 
            /* bFindValidOnly */ js.UndefOr[Boolean], 
            Certificates
          ]
        ])
    ): Self = this.set("Find", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any]) | (/* index */ Double) => Certificate | js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* index */ Double, Certificate]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, Certificate]])
    ): Self = this.set("Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectFunction3(
      value: (/* title */ js.UndefOr[String], /* displayString */ js.UndefOr[String], /* bMultiSelect */ js.UndefOr[Boolean]) => Certificates
    ): Self = this.set("Select", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSelect(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function3[
              /* title */ js.UndefOr[String], 
              /* displayString */ js.UndefOr[String], 
              /* bMultiSelect */ js.UndefOr[Boolean], 
              Certificates
            ]
          ]
        ]) | (PromisifiedFunction[
          js.Function3[
            /* title */ js.UndefOr[String], 
            /* displayString */ js.UndefOr[String], 
            /* bMultiSelect */ js.UndefOr[Boolean], 
            Certificates
          ]
        ])
    ): Self = this.set("Select", value.asInstanceOf[js.Any])
  }
}
