package typings.breeze.mod

import typings.breeze.breeze.config.AdapterInstancesConfig
import typings.breeze.breeze.promises.IPromiseService
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @JSImport("breeze", "config")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "config.ajax")
  @js.native
  def ajax: String = js.native
  @scala.inline
  def ajax_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ajax")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "config.dataService")
  @js.native
  def dataService: String = js.native
  @scala.inline
  def dataService_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataService")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "config.functionRegistry")
  @js.native
  def functionRegistry: js.Object = js.native
  @scala.inline
  def functionRegistry_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("functionRegistry")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getAdapter(interfaceName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdapter")(interfaceName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def getAdapter(interfaceName: String, adapterName: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdapter")(interfaceName.asInstanceOf[js.Any], adapterName.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @scala.inline
  def getAdapterInstance(interfaceName: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdapterInstance")(interfaceName.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  @scala.inline
  def getAdapterInstance(interfaceName: String, adapterName: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdapterInstance")(interfaceName.asInstanceOf[js.Any], adapterName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def initializeAdapterInstance(interfaceName: String, adapterName: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAdapterInstance")(interfaceName.asInstanceOf[js.Any], adapterName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def initializeAdapterInstance(interfaceName: String, adapterName: String, isDefault: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAdapterInstance")(interfaceName.asInstanceOf[js.Any], adapterName.asInstanceOf[js.Any], isDefault.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def initializeAdapterInstances(config: AdapterInstancesConfig): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAdapterInstances")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  
  @JSImport("breeze", "config.interfaceInitialized")
  @js.native
  def interfaceInitialized: Event = js.native
  @scala.inline
  def interfaceInitialized_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interfaceInitialized")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "config.interfaceRegistry")
  @js.native
  def interfaceRegistry: js.Object = js.native
  @scala.inline
  def interfaceRegistry_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interfaceRegistry")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "config.objectRegistry")
  @js.native
  def objectRegistry: js.Object = js.native
  @scala.inline
  def objectRegistry_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objectRegistry")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def registerAdapter(interfaceName: String, adapterCtor: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAdapter")(interfaceName.asInstanceOf[js.Any], adapterCtor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerFunction(fn: js.Function, fnName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunction")(fn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerType(ctor: js.Function, typeName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(ctor.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setQ(q: IPromiseService): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setQ")(q.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("breeze", "config.stringifyPad")
  @js.native
  def stringifyPad: String = js.native
  @scala.inline
  def stringifyPad_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringifyPad")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "config.typeRegistry")
  @js.native
  def typeRegistry: js.Object = js.native
  @scala.inline
  def typeRegistry_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeRegistry")(x.asInstanceOf[js.Any])
}
