package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon._Unpacked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CPAuthenticatedAttributes2> */
trait CPAuthenticatedAttributes2Async
  extends StObject
     with _Unpacked[Any] {
  
  val Add: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* attribute */ CPAttribute, Unit]]]) | (PromisifiedFunction[js.Function1[/* attribute */ CPAttribute, Unit]])
  
  val Clear: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]]
  
  val Count: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
  
  val Item: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* index */ Double, CPAttribute]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, CPAttribute]])
  
  val Remove: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* index */ Double, Unit]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, Unit]])
}
object CPAuthenticatedAttributes2Async {
  
  inline def apply(
    Add: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* attribute */ CPAttribute, Unit]]]) | (PromisifiedFunction[js.Function1[/* attribute */ CPAttribute, Unit]]),
    Clear: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]],
    Count: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double],
    Item: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* index */ Double, CPAttribute]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, CPAttribute]]),
    Remove: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* index */ Double, Unit]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, Unit]])
  ): CPAuthenticatedAttributes2Async = {
    val __obj = js.Dynamic.literal(Add = Add.asInstanceOf[js.Any], Clear = Clear.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Remove = Remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPAuthenticatedAttributes2Async]
  }
  
  extension [Self <: CPAuthenticatedAttributes2Async](x: Self) {
    
    inline def setAdd(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* attribute */ CPAttribute, Unit]]]) | (PromisifiedFunction[js.Function1[/* attribute */ CPAttribute, Unit]])
    ): Self = StObject.set(x, "Add", value.asInstanceOf[js.Any])
    
    inline def setAddFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any]) | (/* attribute */ CPAttribute) => js.Promise[Unpacked[Any]] | Unit
    ): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setClear(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]]
    ): Self = StObject.set(x, "Clear", value.asInstanceOf[js.Any])
    
    inline def setClearFunction0(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setClearFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Clear", js.Any.fromFunction1(value))
    
    inline def setCount(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Count", js.Any.fromFunction1(value))
    
    inline def setItem(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* index */ Double, CPAttribute]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, CPAttribute]])
    ): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any]) | (/* index */ Double) => CPAttribute | js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* index */ Double, Unit]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, Unit]])
    ): Self = StObject.set(x, "Remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any]) | (/* index */ Double) => js.Promise[Unpacked[Any]] | Unit
    ): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
