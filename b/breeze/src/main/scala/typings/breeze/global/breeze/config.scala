package typings.breeze.global.breeze

import typings.breeze.breeze.config.AdapterInstancesConfig
import typings.breeze.breeze.promises.IPromiseService
import typings.breeze.breezeStrings.ajax
import typings.breeze.breezeStrings.dataService
import typings.breeze.breezeStrings.modelLibrary
import typings.breeze.breezeStrings.uriBuilder
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @JSGlobal("breeze.config")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("breeze.config.ajax")
  @js.native
  def ajax: String = js.native
  inline def ajax_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ajax")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.config.dataService")
  @js.native
  def dataService: String = js.native
  inline def dataService_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataService")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.config.functionRegistry")
  @js.native
  def functionRegistry: js.Object = js.native
  inline def functionRegistry_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("functionRegistry")(x.asInstanceOf[js.Any])
  
  inline def getAdapter(interfaceName: ajax | dataService | modelLibrary | uriBuilder): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdapter")(interfaceName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def getAdapter(interfaceName: ajax | dataService | modelLibrary | uriBuilder, adapterName: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdapter")(interfaceName.asInstanceOf[js.Any], adapterName.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def getAdapterInstance(interfaceName: ajax | dataService | modelLibrary | uriBuilder): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdapterInstance")(interfaceName.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def getAdapterInstance(interfaceName: ajax | dataService | modelLibrary | uriBuilder, adapterName: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdapterInstance")(interfaceName.asInstanceOf[js.Any], adapterName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def initializeAdapterInstance(interfaceName: ajax | dataService | modelLibrary | uriBuilder, adapterName: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAdapterInstance")(interfaceName.asInstanceOf[js.Any], adapterName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def initializeAdapterInstance(
    interfaceName: ajax | dataService | modelLibrary | uriBuilder,
    adapterName: String,
    isDefault: Boolean
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAdapterInstance")(interfaceName.asInstanceOf[js.Any], adapterName.asInstanceOf[js.Any], isDefault.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def initializeAdapterInstances(config: AdapterInstancesConfig): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAdapterInstances")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  
  @JSGlobal("breeze.config.interfaceInitialized")
  @js.native
  def interfaceInitialized: Event = js.native
  inline def interfaceInitialized_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interfaceInitialized")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.config.interfaceRegistry")
  @js.native
  def interfaceRegistry: js.Object = js.native
  inline def interfaceRegistry_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interfaceRegistry")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.config.objectRegistry")
  @js.native
  def objectRegistry: js.Object = js.native
  inline def objectRegistry_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objectRegistry")(x.asInstanceOf[js.Any])
  
  inline def registerAdapter(interfaceName: ajax | dataService | modelLibrary | uriBuilder, adapterCtor: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAdapter")(interfaceName.asInstanceOf[js.Any], adapterCtor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerFunction(fn: js.Function, fnName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunction")(fn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerType(ctor: js.Function, typeName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(ctor.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setQ(q: IPromiseService): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setQ")(q.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("breeze.config.stringifyPad")
  @js.native
  def stringifyPad: String = js.native
  inline def stringifyPad_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringifyPad")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.config.typeRegistry")
  @js.native
  def typeRegistry: js.Object = js.native
  inline def typeRegistry_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeRegistry")(x.asInstanceOf[js.Any])
}
