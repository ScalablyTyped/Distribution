package typings.breeze.global.breeze

import typings.breeze.breeze.config.AdapterInstancesConfig
import typings.breeze.breeze.promises.IPromiseService
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @JSGlobal("breeze.config")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("breeze.config.ajax")
  @js.native
  def ajax: String = js.native
  @scala.inline
  def ajax_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ajax")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.config.dataService")
  @js.native
  def dataService: String = js.native
  @scala.inline
  def dataService_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataService")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.config.functionRegistry")
  @js.native
  def functionRegistry: js.Object = js.native
  @scala.inline
  def functionRegistry_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("functionRegistry")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.config.getAdapter")
  @js.native
  def getAdapter(interfaceName: String): js.Function = js.native
  @JSGlobal("breeze.config.getAdapter")
  @js.native
  def getAdapter(interfaceName: String, adapterName: String): js.Function = js.native
  
  @JSGlobal("breeze.config.getAdapterInstance")
  @js.native
  def getAdapterInstance(interfaceName: String): js.Object = js.native
  @JSGlobal("breeze.config.getAdapterInstance")
  @js.native
  def getAdapterInstance(interfaceName: String, adapterName: String): js.Object = js.native
  
  @JSGlobal("breeze.config.initializeAdapterInstance")
  @js.native
  def initializeAdapterInstance(interfaceName: String, adapterName: String): js.Object = js.native
  @JSGlobal("breeze.config.initializeAdapterInstance")
  @js.native
  def initializeAdapterInstance(interfaceName: String, adapterName: String, isDefault: Boolean): js.Object = js.native
  
  @JSGlobal("breeze.config.initializeAdapterInstances")
  @js.native
  def initializeAdapterInstances(config: AdapterInstancesConfig): js.Array[js.Object] = js.native
  
  @JSGlobal("breeze.config.interfaceInitialized")
  @js.native
  def interfaceInitialized: Event = js.native
  @scala.inline
  def interfaceInitialized_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interfaceInitialized")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.config.interfaceRegistry")
  @js.native
  def interfaceRegistry: js.Object = js.native
  @scala.inline
  def interfaceRegistry_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interfaceRegistry")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.config.objectRegistry")
  @js.native
  def objectRegistry: js.Object = js.native
  @scala.inline
  def objectRegistry_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objectRegistry")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.config.registerAdapter")
  @js.native
  def registerAdapter(interfaceName: String, adapterCtor: js.Function): Unit = js.native
  
  @JSGlobal("breeze.config.registerFunction")
  @js.native
  def registerFunction(fn: js.Function, fnName: String): Unit = js.native
  
  @JSGlobal("breeze.config.registerType")
  @js.native
  def registerType(ctor: js.Function, typeName: String): Unit = js.native
  
  @JSGlobal("breeze.config.setQ")
  @js.native
  def setQ(q: IPromiseService): Unit = js.native
  
  @JSGlobal("breeze.config.stringifyPad")
  @js.native
  def stringifyPad: String = js.native
  @scala.inline
  def stringifyPad_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringifyPad")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.config.typeRegistry")
  @js.native
  def typeRegistry: js.Object = js.native
  @scala.inline
  def typeRegistry_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeRegistry")(x.asInstanceOf[js.Any])
}
