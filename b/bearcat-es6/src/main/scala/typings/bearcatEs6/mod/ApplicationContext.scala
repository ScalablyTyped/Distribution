package typings.bearcatEs6.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationContext extends EventEmitter {
  
  var active: Boolean = js.native
  
  /**
    * ApplicationContext add beanFactoryPostProcessor.
    *
    * @param   beanFactoryPostProcessor
    * @api     public
    */
  def addBeanFactoryPostProcessor(beanFactoryPostProcessor: BeanPostProcessor): Unit = js.native
  
  /**
    * ApplicationContext async load bean with bean ids.
    *
    * @param   ids bean ids
    * @param   cb callback function
    * @api     public
    */
  def async(ids: js.Array[String]): Unit = js.native
  def async(ids: js.Array[String], cb: CallbackFunc): Unit = js.native
  
  var asyncScriptLoader: AsyncScriptLoader = js.native
  
  var base: String = js.native
  
  var beanFactory: BeanFactory = js.native
  
  var beanFactoryPostProcessors: js.Array[BeanPostProcessor] = js.native
  
  var bootStrapLoader: BootStrapLoader = js.native
  
  /**
    * ApplicationContext cancel refresh.
    *
    * @api     publish
    */
  def cancelRefresh(): Unit = js.native
  
  /**
    * ApplicationContext close beanFactory.
    *
    * @api     public
    */
  def closeBeanFactory(): Unit = js.native
  
  var configLocations: js.Array[String] = js.native
  
  /**
    * ApplicationContext check ApplicationContext contains bean or not.
    *
    * @param   beanName
    * @return  a boolean value that contains bean or not
    * @api     public
    */
  def containsBean(beanName: String): Boolean = js.native
  
  /**
    * ApplicationContext check ApplicationContext contains beanName beanDefinition or not.
    *
    * @param   beanName
    * @return  a boolean value that contains beanName beanDefinition or not
    * @api     public
    */
  def containsBeanDefinition(beanName: String): Boolean = js.native
  
  var cpath: String = js.native
  
  /**
    * ApplicationContext service locator pattern define module.
    *
    * @param   id
    * @param   factory factory function
    * @param   context context object
    * @api     public
    */
  def define(id: String, factory: ConstructorFunction): Unit = js.native
  def define(id: String, factory: ConstructorFunction, context: js.Object): Unit = js.native
  
  /**
    * ApplicationContext destroy.
    *
    * @api     public
    */
  def destroy(): Unit = js.native
  
  /**
    * ApplicationContext do extend bean.
    *
    * @param   beanName
    * @param   superBeanName
    * @api     public
    */
  def doExtendBean(beanName: String, superBeanName: String): Unit = js.native
  
  var env: String = js.native
  
  /**
    * ApplicationContext extend bean.
    *
    * @param   beanName
    * @param   superBeanName or superBeanName array
    * @api     public
    */
  def extendBean(beanName: String, superBeanName: String): Unit = js.native
  def extendBean(beanName: String, superBeanName: js.Array[String]): Unit = js.native
  
  var extendBeanCurMap: js.Object = js.native
  
  var extendBeanMap: js.Object = js.native
  
  var extendedBeanMap: js.Object = js.native
  
  /**
    * ApplicationContext get asyncScriptLoader.
    *
    * @return  asyncScriptLoader
    * @api     public
    */
  def getAsyncScriptLoader(): AsyncScriptLoader = js.native
  
  /**
    * ApplicationContext get base path.
    *
    * @return  base path
    * @api     public
    */
  def getBase(): String = js.native
  
  /**
    * ApplicationContext getBean through beanName from applicationContext.
    *
    * @param   beanName
    * @return  beanObject
    * @api     public
    */
  def getBean(beanName: String): js.Object = js.native
  
  /**
    * ApplicationContext getBean through $ annotation function from applicationContext.
    *
    * @param   func $ annotation function
    * @return  beanObject
    * @api     public
    */
  def getBeanByFunc(func: ConstructorFunction): js.Object = js.native
  
  /**
    * ApplicationContext getBean through metaObject from applicationContext.
    *
    * @param   meta metaObject
    * @return  beanObject
    * @api     public
    */
  def getBeanByMeta(meta: js.Object): js.Object = js.native
  
  /**
    * ApplicationContext get beanDefinition.
    *
    * @param   beanName
    * @return  beanDefinition
    * @api     public
    */
  def getBeanDefinition(beanName: String): js.Object = js.native
  
  /**
    * ApplicationContext getBeanFactory.
    *
    * @return  beanFactory
    * @api     public
    */
  def getBeanFactory(): BeanFactory = js.native
  
  /**
    * ApplicationContext get beanFactoryPostProcessors.
    *
    * @return  beanFactoryPostProcessors
    * @api     public
    */
  def getBeanFactoryProcessors(): js.Array[BeanPostProcessor] = js.native
  
  /**
    * ApplicationContext get bean contructor function.
    *
    * @param   beanName
    * @return  bean constructor function
    * @api     public
    */
  def getBeanFunction(beanName: String): ConstructorFunction = js.native
  
  /**
    * ApplicationContext get bootStrapLoader.
    *
    * @return  bootStrapLoader
    * @api     public
    */
  def getBootStrapLoader(): BootStrapLoader = js.native
  
  /**
    * ApplicationContext get contextPath locations.
    *
    * @return  contextPath locations
    * @api     public
    */
  def getConfigLocations(): js.Array[String] = js.native
  
  /**
    * ApplicationContext get config path.
    *
    * @return  config path
    * @api     public
    */
  def getConfigPath(): String = js.native
  
  /**
    * ApplicationContext get env.
    *
    * @return  env
    * @api     public
    */
  def getEnv(): String = js.native
  
  /**
    * ApplicationContext get hot reload path.
    *
    * @return  hpath hot reload path
    * @api     public
    */
  def getHotPath(): String = js.native
  
  /**
    * ApplicationContext getModel through modelId.
    *
    * @param   modelId
    * @return  model
    * @api     public
    */
  def getModel(modelId: String): js.Object = js.native
  
  /**
    * ApplicationContext getModelDefinition through modelId.
    *
    * @param   modelId
    * @return  modelDefinition
    * @api     public
    */
  def getModelDefinition(modelId: String): js.Object = js.native
  
  /**
    * ApplicationContext getModuleFactory.
    *
    * @return  moduleFactory
    * @api     public
    */
  def getModuleFactory(): ModuleFactory = js.native
  
  /**
    * ApplicationContext get metaObjects resource from contextPath.
    *
    * @param   cpath contextPath
    * @return  metaObjects
    * @api     public
    */
  def getResource(cpath: String): js.Object = js.native
  
  /**
    * ApplicationContext get resourceLoader.
    *
    * @return  resourceLoader
    * @api     public
    */
  def getResourceLoader(): ResourceLoader = js.native
  
  /**
    * ApplicationContext get container startUpDate.
    *
    * @return  startUpDate
    * @api     public
    */
  def getStartupDate(): Double = js.native
  
  /**
    * ApplicationContext check whether applicationContext has beanFactory or not.
    *
    * @return  true|false
    * @api     public
    */
  def hasBeanFactory(): Boolean = js.native
  
  var hpath: String = js.native
  
  /**
    * ApplicationContext init.
    *
    * @api     public
    */
  def init(): Unit = js.native
  
  /**
    * ApplicationContext check whether applicationContext is active or not.
    *
    * @api     public
    */
  def isActive(): Boolean = js.native
  
  /**
    * ApplicationContext check bean is a prototype or not.
    *
    * @param   beanName
    * @return  a boolean value that is a prototype or not
    * @api     public
    */
  def isPrototype(beanName: String): Boolean = js.native
  
  /**
    * ApplicationContext check whether applicationContext is running or not.
    *
    * @return  true|false
    * @api     public
    */
  def isRunning(): Boolean = js.native
  
  /**
    * ApplicationContext check bean is a singleton or not.
    *
    * @param   beanName
    * @return  a boolean value that is a singleton or not
    * @api     public
    */
  def isSingleton(beanName: String): Boolean = js.native
  
  var loadBeans: js.Array[String] = js.native
  
  /**
    * ApplicationContext add module(bean) to IoC container through $ annotation function from applicationContext.
    *
    * @param   func $ annotation function
    * @param   context
    * @api     public
    */
  def module(func: ConstructorFunction): Unit = js.native
  def module(func: ConstructorFunction, context: js.Object): Unit = js.native
  
  var moduleFactory: ModuleFactory = js.native
  
  var opts: js.Object = js.native
  
  /**
    * ApplicationContext do refresh actions.
    * refresh beanFactory, preIntialize singleton Beans
    *
    * @param   cb callback function
    * @api     public
    */
  def refresh(): Unit = js.native
  def refresh(cb: CallbackFunc): Unit = js.native
  
  var reloadMap: js.Object = js.native
  
  /**
    * ApplicationContext remove beanDefinition from ApplicationContext.
    *
    * @param   beanName
    * @api     public
    */
  def removeBeanDefinition(beanName: String): Unit = js.native
  
  /**
    * ApplicationContext service locator pattern define module.
    *
    * @param   id
    * @api     public
    */
  def require(id: String): js.Any = js.native
  
  var resourceLoader: ResourceLoader = js.native
  
  /**
    * ApplicationContext set config path.
    *
    * @param   cpath config path
    * @api     public
    */
  def setConfigPath(cpath: String): Unit = js.native
  
  /**
    * ApplicationContext set env.
    *
    * @param   env
    * @api     public
    */
  def setEnv(env: String): Unit = js.native
  
  /**
    * ApplicationContext set hot reload path.
    *
    * @param   hpath hot reload path
    * @api     public
    */
  def setHotPath(hpath: String): Unit = js.native
  
  /**
    * ApplicationContext set container startUpDate.
    *
    * @param   startUpDate
    * @api     public
    */
  def setStartupDate(startUpDate: Double): Unit = js.native
  
  var startUpDate: Double = js.native
  
  /**
    * ApplicationContext add startup loaded bean ids.
    *
    * @param   ids loaded bean ids
    * @api     public
    */
  def use(ids: js.Array[String]): Unit = js.native
}
