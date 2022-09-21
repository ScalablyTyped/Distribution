package typings.bearcatEs6

import org.scalablytyped.runtime.Shortcut
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bearcat-es6", JSImport.Namespace)
  @js.native
  val ^ : Bearcat = js.native
  
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
    def require(id: String): Any = js.native
    
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
  
  @js.native
  trait AsyncScriptLoader extends StObject {
    
    var applicationContext: ApplicationContext = js.native
    
    var cacheModules: js.Object = js.native
    
    /**
      * AsyncScriptLoader get script from cache or new.
      *
      * @param   uri
      * @param   deps id
      * @return  module
      * @api     public
      */
    def get(uri: String, deps: js.Array[String]): js.Object = js.native
    
    /**
      * AsyncScriptLoader get loaded beans list.
      *
      * @return  loaded beans
      * @api     public
      */
    def getLoadBeans(): js.Array[js.Object] = js.native
    
    /**
      * AsyncScriptLoader get bean path through bean id.
      *
      * @param   id
      * @return  bean path
      * @api     public
      */
    def getPathById(id: String): String = js.native
    
    /**
      * AsyncScriptLoader load beans asynchronously.
      *
      * @param   ids loaded beans ids
      * @param   cb callback function
      * @api     public
      */
    def load(ids: js.Array[String]): Unit = js.native
    def load(ids: js.Array[String], cb: CallbackFunc): Unit = js.native
    
    var loaderDir: String = js.native
    
    /**
      * AsyncScriptLoader register script with id, meta.
      *
      * @param   id
      * @param   beanMeta
      * @api     public
      */
    def module(id: String, beanMeta: js.Object): Unit = js.native
    
    /**
      * AsyncScriptLoader resolve uri path with refUri.
      *
      * @param   id
      * @param   refUri
      * @return  resolved path
      * @api     public
      */
    def resolve(id: String, refUri: String): String = js.native
    
    /**
      * AsyncScriptLoader resolve deps through bean meta.
      *
      * @param   beanMeta
      * @return  resolved deps
      * @api     public
      */
    def resolveDeps(beanMeta: js.Object): js.Array[String] = js.native
    
    /**
      * AsyncScriptLoader save load script with uri meta.
      *
      * @param   uri
      * @param   meta
      * @api     public
      */
    def save(uri: String, meta: js.Object): Unit = js.native
    
    /**
      * AsyncScriptLoader set applicationContext reference.
      *
      * @param   applicationContext
      * @api     public
      */
    def setApplicationContext(applicationContext: ApplicationContext): Unit = js.native
  }
  
  @js.native
  trait BeanFactory extends StObject {
    
    /**
      * BeanFactory add beanPostProcessor to BeanFactory.
      * @param   beanPostProcessor
      * @api     public
      */
    def addBeanPostProcessor(beanPostProcessor: BeanPostProcessor): Unit = js.native
    
    var aspects: js.Array[js.Object] = js.native
    
    var beanCurMap: js.Object = js.native
    
    var beanDefinitions: js.Object = js.native
    
    var beanFunctions: js.Object = js.native
    
    var beanPostProcessors: js.Array[BeanPostProcessor] = js.native
    
    var constraints: js.Object = js.native
    
    /**
      * BeanFactory check BeanFactory contains bean or not.
      *
      * @param   beanName
      * @return  true | false
      * @api     public
      */
    def containsBean(beanName: String): Boolean = js.native
    
    /**
      * BeanFactory check BeanFactory contains beanName beanDefinition or not.
      *
      * @param   beanName
      * @return  true | false
      * @api     public
      */
    def containsBeanDefinition(beanName: String): Boolean = js.native
    
    /**
      * BeanFactory destroy bean.
      *
      * @param   beanName
      * @param   beanObject
      * @api     public
      */
    def destroyBean(beanName: String, beanObject: js.Object): Unit = js.native
    
    /**
      * BeanFactory destroy BeanFactory.
      *
      * @api     public
      */
    def destroyBeanFactory(): Unit = js.native
    
    /**
      * BeanFactory destroy singleton.
      *
      * @param   beanName
      * @api     public
      */
    def destroySingleton(beanName: String): Unit = js.native
    
    /**
      * BeanFactory destroy singletons.
      *
      * @api     public
      */
    def destroySingletons(): Unit = js.native
    
    /**
      * BeanFactory get aspects.
      *
      * @return  aspects
      * @api     public
      */
    def getAspects(): js.Array[js.Object] = js.native
    
    /**
      * BeanFactory get bean instance through BeanFactory IoC container.
      *
      * @param   beanName
      * @return  bean object
      * @api     public
      */
    def getBean(beanName: String): js.Object = js.native
    
    /**
      * BeanFactory get beanDefinition.
      *
      * @param   beanName
      * @return  beanDefinition
      * @api     public
      */
    def getBeanDefinition(beanName: String): js.Object = js.native
    
    /**
      * BeanFactory get beanDefinitions.
      *
      * @return  beanDefinitions
      * @api     public
      */
    def getBeanDefinitions(): js.Object = js.native
    
    /**
      * BeanFactory get bean contructor function.
      *
      * @param   beanName
      * @return  bean constructor function
      * @api     public
      */
    def getBeanFunction(beanName: String): ConstructorFunction = js.native
    
    /**
      * BeanFactory get beanPostProcessors.
      * @return  beanPostProcessors
      * @api public
      */
    def getBeanPostProcessors(): js.Array[BeanPostProcessor] = js.native
    
    /**
      * BeanFactory get bean proxy through BeanFactory IoC container for lazy init bean.
      * when invoke bean proxy, proxy will invoke getBean to get the target bean
      *
      * @param   beanName
      * @return  bean proxy object
      * @api     public
      */
    def getBeanProxy(beanName: String): js.Object = js.native
    
    /**
      * BeanFactory get constraint through BeanFactory IoC container.
      *
      * @param   cid
      * @return  constraint bean object
      * @api     public
      */
    def getConstraint(cid: String): js.Object = js.native
    
    /**
      * BeanFactory get getConstraintDefinition.
      *
      * @param   cid
      * @return  getConstraintDefinition
      * @api     public
      */
    def getConstraintDefinition(cid: String): js.Object = js.native
    
    /**
      * BeanFactory get init method.
      *
      * @param   beanName
      * @return  bean init method
      * @api     public
      */
    def getInitCb(beanName: String): CallbackFunc = js.native
    
    /**
      * BeanFactory get modelDefinition.
      *
      * @param   modelId
      * @return  modelDefinition
      * @api     public
      */
    def getModelDefinition(modelId: String): js.Object = js.native
    
    /**
      * BeanFactory get modelDefinition by table.
      *
      * @param   table name
      * @return  modelDefinition
      * @api     public
      */
    def getModelDefinitionByTable(table: String): js.Object = js.native
    
    /**
      * BeanFactory get modelDefinitions.
      *
      * @return  modelDefinition map
      * @api     public
      */
    def getModelDefinitions(): js.Object = js.native
    
    /**
      * BeanFactory get model through BeanFactory IoC container.
      *
      * @param   modelId
      * @return  model proxy object
      * @api     public
      */
    def getModelProxy(modelId: String): js.Object = js.native
    
    var initCbMap: js.Object = js.native
    
    /**
      * BeanFactory check bean is a prototype or not.
      *
      * @param   beanName
      * @return  true | false
      * @api     public
      */
    def isPrototype(beanName: String): Boolean = js.native
    
    /**
      * BeanFactory check bean is a singleton or not.
      *
      * @param   beanName
      * @return  true | false
      * @api     public
      */
    def isSingleton(beanName: String): Boolean = js.native
    
    var modelMap: js.Object = js.native
    
    /**
      * BeanFactory instantiating singletion beans in advance.
      *
      * @param   cb callback function
      * @api     public
      */
    def preInstantiateSingletons(): Unit = js.native
    def preInstantiateSingletons(cb: CallbackFunc): Unit = js.native
    
    /**
      * BeanFactory register bean through metaObject into BeanFactory.
      *
      * @param   beanName
      * @param   metaObject
      * @api     public
      */
    def registerBean(beanName: String, metaObject: js.Object): Unit = js.native
    
    /**
      * BeanFactory register beans through metaObjects into BeanFactory.
      *
      * @param   metaObjects
      * @api     public
      */
    def registerBeans(metaObjects: js.Object): Unit = js.native
    
    /**
      * BeanFactory register constraint through metaObject into BeanFactory.
      *
      * @param   beanName bean id
      * @param   cid      constraint id
      * @param   metaObject
      * @api     public
      */
    def registerConstraint(beanName: String, cid: String, metaObject: js.Object): Unit = js.native
    
    /**
      * BeanFactory register model through metaObject into BeanFactory.
      *
      * @param   beanName bean id
      * @param   modelId  model id
      * @param   metaObject
      * @api     public
      */
    def registerModel(beanName: String, modelId: String, metaObject: js.Object): Unit = js.native
    
    /**
      * BeanFactory remove beanDefinition from BeanFactory.
      *
      * @param   beanName
      * @api     public
      */
    def removeBeanDefinition(beanName: String): Unit = js.native
    
    /**
      * BeanFactory remove bean contructor function from BeanFactory.
      *
      * @param   beanName
      * @api     public
      */
    def removeFunction(beanName: String): Unit = js.native
    
    /**
      * BeanFactory set bean contructor function.
      *
      * @param   beanName
      * @param   func bean constructor function
      * @api     public
      */
    def setBeanFunction(beanName: String, func: ConstructorFunction): Unit = js.native
    
    /**
      * BeanFactory set init method.
      *
      * @param   beanName
      * @param   initCb bean init method
      * @api     public
      */
    def setInitCb(beanName: String, initCb: CallbackFunc): Unit = js.native
    
    /**
      * BeanFactory set parent bean.
      *
      * @param   beanName
      * @return  beanDefinition
      * @api     public
      */
    def setParentBean(beanName: String): js.Object = js.native
    
    /**
      * BeanFactory set table model map.
      *
      * @param   table name
      * @param   modelDefinition
      * @api     public
      */
    def setTableModelMap(table: String, modelDefinition: js.Object): Unit = js.native
    
    var singletonBeanFactory: SingletonBeanFactory = js.native
    
    var tableModelMap: js.Object = js.native
  }
  
  trait BeanPostProcessor extends StObject {
    
    def postProcessBeanFactory(): Unit
    @JSName("postProcessBeanFactory")
    var postProcessBeanFactory_Original: CallbackFunc
  }
  object BeanPostProcessor {
    
    inline def apply(postProcessBeanFactory: () => Unit): BeanPostProcessor = {
      val __obj = js.Dynamic.literal(postProcessBeanFactory = js.Any.fromFunction0(postProcessBeanFactory))
      __obj.asInstanceOf[BeanPostProcessor]
    }
    
    extension [Self <: BeanPostProcessor](x: Self) {
      
      inline def setPostProcessBeanFactory(value: () => Unit): Self = StObject.set(x, "postProcessBeanFactory", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Bearcat extends StObject {
    
    var applicationContext: ApplicationContext = js.native
    
    /**
      * Bearcat async loading beans.
      *
      * @param   ids async loading beans id
      * @param   cb callback with loaded bean instances
      * @api     public
      */
    def async(ids: String): Unit = js.native
    def async(ids: String, cb: CallbackFunc): Unit = js.native
    def async(ids: js.Array[String]): Unit = js.native
    def async(ids: js.Array[String], cb: CallbackFunc): Unit = js.native
    
    /**
      * Bearcat call function used for inherits to call super constructor function.
      *
      * Examples:
      *
      *
      *      bearcat.call("car", this);
      *
      *
      * @param   beanName
      * @param   context
      * @param   args
      * @api     public
      */
    def call(beanName: String, context: js.Object, args: Any*): Unit = js.native
    def call(beanName: String, context: Null, args: Any*): Unit = js.native
    def call(beanName: String, context: Unit, args: Any*): Unit = js.native
    
    var configLocations: js.Array[String] = js.native
    
    /**
      * Bearcat createApp constructor function.
      *
      * @param    configLocations context path array
      * @param   opts
      * @param   opts.NODE_ENV                    setup env
      * @param   opts.BEARCAT_ENV                 setup env
      * @param   opts.NODE_CPATH                  setup config path
      * @param   opts.BEARCAT_CPATH               setup config path
      * @param   opts.BEARCAT_HPATH               setup hot reload path(s), usually it is the scan source directory(app by default)
      * @param   opts.BEARCAT_LOGGER              setup 'off' to turn off bearcat logger configuration
      * @param   opts.BEARCAT_HOT                 setup 'on' to turn on bearcat hot code reload
      * @param   opts.BEARCAT_ANNOTATION          setup 'off' to turn off bearcat $ based annotation
      * @param   opts.BEARCAT_GLOBAL             setup bearcat to be global object
      * @param   opts.BEARCAT_FUNCTION_STRING     setup bearcat to use func.toString for $ based annotation
      *
      * @return  bearcat object
      * @api     public
      */
    def createApp(configLocations: js.Array[String], opts: js.Object): Bearcat = js.native
    def createApp(opts: js.Object): Bearcat = js.native
    
    /**
      * Bearcat define module(bean).
      *
      * @param   id
      * @param   factory function
      * @param   context object
      * @api     public
      */
    def define(id: String, factory: ParamClassFunc): Unit = js.native
    def define(id: String, factory: ParamClassFunc, context: js.Object): Unit = js.native
    
    /**
      * Bearcat shim to enable function inherits.
      *
      * Examples:
      *
      *
      *      bearcat.extend("bus", "car");
      *
      *
      * @param  beanName
      * @param  superBeanName or superBeanName array
      * @api    public
      */
    def extend(beanName: String, superBeanName: String): Unit = js.native
    def extend(beanName: String, superBeanName: js.Array[String]): Unit = js.native
    
    /**
      * Bearcat get applicationContext.
      *
      * @return   applicationContext
      * @api     public
      */
    def getApplicationContext(): ApplicationContext = js.native
    
    /**
      * Bearcat get bean from IoC container through beanName or meta argument.
      *
      * @param   beanName
      * @return  bean
      * @api     public
      */
    def getBean(beanName: String): js.Object | Null = js.native
    def getBean(beanName: js.Object): js.Object | Null = js.native
    def getBean(beanName: ParamClassFunc): js.Object | Null = js.native
    
    /**
      * Bearcat get bean from IoC container through $ annotation function.
      *
      * @param   func $ annotation function
      * @api     public
      */
    def getBeanByFunc(func: ParamClassFunc): js.Object | Null = js.native
    
    /**
      * Bearcat get bean from IoC container through meta argument.
      *
      * @param   meta meta object
      * @api     public
      */
    def getBeanByMeta(meta: js.Object): js.Object | Null = js.native
    
    /**
      * Bearcat get beanFactory instance.
      *
      * @return  beanFactory instance
      * @api     public
      */
    def getBeanFactory(): BeanFactory = js.native
    
    /**
      * Bearcat get bean constructor function from IoC container through beanName, the same as bearcat.getFunction.
      *
      * Examples:
      *
      *
      *      // through beanName
      *      var Car = bearcat.getClass("car");
      *
      *
      * @param   beanName
      * @return  bean constructor function
      * @api     public
      */
    def getClass(beanName: String): ConstructorFunction | Null = js.native
    
    /**
      * Bearcat get bean constructor function from IoC container through beanName.
      *
      * Examples:
      *
      *
      *      // through beanName
      *      var Car = bearcat.getFunction("car");
      *
      *
      * @param   beanName
      * @return  bean constructor function
      * @api     public
      */
    def getFunction(beanName: String): ConstructorFunction | Null = js.native
    
    /**
      * Bearcat get model from bearcat through modelId.
      *
      * Examples:
      *
      *
      *      // through modelId
      *      var carModel = bearcat.getModel("car");
      *
      *
      * @param   modelId
      * @return  model
      * @api     public
      */
    def getModel(modelId: String): js.Object = js.native
    
    /**
      * Bearcat convenient function for using in MVC route mapping.
      *
      * Examples:
      *
      *
      *      // express
      *      var app = express();
      *      app.get('/', bearcat.getRoute('bearController', 'index'));
      *
      *
      * @param   beanName
      * @param   fnName routeName
      * @api     public
      */
    def getRoute(beanName: String, fnName: String): ConstructorFunction = js.native
    
    /**
      * Bearcat add module(bean) to IoC container through $ annotation function.
      *
      * @param   func $ annotation function
      * @param   context context object
      * @api     public
      */
    def module(func: ParamClassFunc): js.Object | Unit = js.native
    def module(func: ParamClassFunc, context: js.Object): js.Object | Unit = js.native
    
    var opts: js.Object = js.native
    
    /**
      * Bearcat add module(bean) to IoC container through $ annotation function.
      *
      * Examples:
      *
      *      var Car = bearcat.require('car');
      *
      * @param   id
      * @api     public
      */
    def require(id: String): Any = js.native
    
    /**
      * Bearcat start app.
      *
      * @param   cb start callback function
      * @api     public
      */
    def start(): Unit = js.native
    def start(cb: CallbackFunc): Unit = js.native
    
    var startTime: Double = js.native
    
    var state: Double = js.native
    
    /**
      * Bearcat stop app.
      * it will stop internal applicationContext, destroy all singletonBeans
      *
      * @api     public
      */
    def stop(): Unit = js.native
    
    /**
      * Bearcat add async loading beans, this just add beans needed to be loaded to bearcat.
      *
      * Examples:
      *
      *      bearcat.use(['car']);
      *      bearcat.use('car');
      *
      * @param   ids async loading beans id
      * @api     public
      */
    def use(ids: String): Unit = js.native
    def use(ids: js.Array[String]): Unit = js.native
    
    var version: String = js.native
  }
  
  trait BootStrapLoader extends StObject {
    
    /**
      * BootStrapLoader load script files.
      *
      * @param   idPaths
      * @api     public
      */
    def load(idPaths: js.Array[String]): Unit
  }
  object BootStrapLoader {
    
    inline def apply(load: js.Array[String] => Unit): BootStrapLoader = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load))
      __obj.asInstanceOf[BootStrapLoader]
    }
    
    extension [Self <: BootStrapLoader](x: Self) {
      
      inline def setLoad(value: js.Array[String] => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    }
  }
  
  type CallbackFunc = js.Function0[Unit]
  
  trait ConfigLoader extends StObject {
    
    /**
      * ConfigLoader get meta loader.
      *
      * @return  meta loader
      * @api     public
      */
    def getMetaLoader(): MetaLoader
    
    /**
      * ConfigLoader get recursive scan paths and metaObjects in context.json.
      *
      * @param   cpath context path
      * @param   scanPaths scan paths
      * @param   metaObjects
      * @api     public
      */
    def getRecursiveScanPath(cpath: String, scanPaths: js.Array[String], metaObjects: js.Object): Unit
    
    /**
      * ConfigLoader get meta objects from context path.
      *
      * @param   cpath context path
      * @return  meta objects
      * @api     public
      */
    def getResources(cpath: String): js.Object
  }
  object ConfigLoader {
    
    inline def apply(
      getMetaLoader: () => MetaLoader,
      getRecursiveScanPath: (String, js.Array[String], js.Object) => Unit,
      getResources: String => js.Object
    ): ConfigLoader = {
      val __obj = js.Dynamic.literal(getMetaLoader = js.Any.fromFunction0(getMetaLoader), getRecursiveScanPath = js.Any.fromFunction3(getRecursiveScanPath), getResources = js.Any.fromFunction1(getResources))
      __obj.asInstanceOf[ConfigLoader]
    }
    
    extension [Self <: ConfigLoader](x: Self) {
      
      inline def setGetMetaLoader(value: () => MetaLoader): Self = StObject.set(x, "getMetaLoader", js.Any.fromFunction0(value))
      
      inline def setGetRecursiveScanPath(value: (String, js.Array[String], js.Object) => Unit): Self = StObject.set(x, "getRecursiveScanPath", js.Any.fromFunction3(value))
      
      inline def setGetResources(value: String => js.Object): Self = StObject.set(x, "getResources", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ConstructorFunction extends StObject {
    
    def apply(params: Any*): Any = js.native
  }
  
  trait MetaLoader extends StObject {
    
    /**
      * MetaLoader get metaObjects.
      *
      * @return  metaObjects
      * @api     public
      */
    def getMetaObjects(): js.Object
    
    /**
      * MetaLoader load metaObjects from meta path.
      *
      * @param   mpath
      * @return  meta objects
      * @api     public
      */
    def load(mpath: String): js.Object
    
    var metaObjects: js.Object
    
    /**
      * MetaLoader set metaObject to beanName.
      *
      * @param   beanName
      * @param   metaObject
      * @api     public
      */
    def setMetaObject(beanName: String, metaObject: js.Object): Unit
  }
  object MetaLoader {
    
    inline def apply(
      getMetaObjects: () => js.Object,
      load: String => js.Object,
      metaObjects: js.Object,
      setMetaObject: (String, js.Object) => Unit
    ): MetaLoader = {
      val __obj = js.Dynamic.literal(getMetaObjects = js.Any.fromFunction0(getMetaObjects), load = js.Any.fromFunction1(load), metaObjects = metaObjects.asInstanceOf[js.Any], setMetaObject = js.Any.fromFunction2(setMetaObject))
      __obj.asInstanceOf[MetaLoader]
    }
    
    extension [Self <: MetaLoader](x: Self) {
      
      inline def setGetMetaObjects(value: () => js.Object): Self = StObject.set(x, "getMetaObjects", js.Any.fromFunction0(value))
      
      inline def setLoad(value: String => js.Object): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setMetaObjects(value: js.Object): Self = StObject.set(x, "metaObjects", value.asInstanceOf[js.Any])
      
      inline def setSetMetaObject(value: (String, js.Object) => Unit): Self = StObject.set(x, "setMetaObject", js.Any.fromFunction2(value))
    }
  }
  
  trait ModuleFactory extends StObject {
    
    def define(id: String, factory: js.Object): Unit
    
    var factoryMap: js.Object
    
    var moduleMap: js.Object
    
    def require(id: String): Any
  }
  object ModuleFactory {
    
    inline def apply(
      define: (String, js.Object) => Unit,
      factoryMap: js.Object,
      moduleMap: js.Object,
      require: String => Any
    ): ModuleFactory = {
      val __obj = js.Dynamic.literal(define = js.Any.fromFunction2(define), factoryMap = factoryMap.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any], require = js.Any.fromFunction1(require))
      __obj.asInstanceOf[ModuleFactory]
    }
    
    extension [Self <: ModuleFactory](x: Self) {
      
      inline def setDefine(value: (String, js.Object) => Unit): Self = StObject.set(x, "define", js.Any.fromFunction2(value))
      
      inline def setFactoryMap(value: js.Object): Self = StObject.set(x, "factoryMap", value.asInstanceOf[js.Any])
      
      inline def setModuleMap(value: js.Object): Self = StObject.set(x, "moduleMap", value.asInstanceOf[js.Any])
      
      inline def setRequire(value: String => Any): Self = StObject.set(x, "require", js.Any.fromFunction1(value))
    }
  }
  
  type ParamClassFunc = js.Function0[Unit]
  
  trait ResourceLoader extends StObject {
    
    /**
      * ResourceLoader add context load path.
      *
      * @param   cpath context load path
      * @api     public
      */
    def addLoadPath(cpath: String): Unit
    
    /**
      * ResourceLoader get config loader.
      *
      * @return  config loader
      * @api     public
      */
    def getConfigLoader(): ConfigLoader
    
    /**
      * ResourceLoader load metaObjects from context path.
      *
      * @param   cpath context load path
      * @return  metaObjects
      * @api     public
      */
    def load(cpath: String): js.Object
    
    var loadPathMap: js.Object
    
    var loadPaths: String
  }
  object ResourceLoader {
    
    inline def apply(
      addLoadPath: String => Unit,
      getConfigLoader: () => ConfigLoader,
      load: String => js.Object,
      loadPathMap: js.Object,
      loadPaths: String
    ): ResourceLoader = {
      val __obj = js.Dynamic.literal(addLoadPath = js.Any.fromFunction1(addLoadPath), getConfigLoader = js.Any.fromFunction0(getConfigLoader), load = js.Any.fromFunction1(load), loadPathMap = loadPathMap.asInstanceOf[js.Any], loadPaths = loadPaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceLoader]
    }
    
    extension [Self <: ResourceLoader](x: Self) {
      
      inline def setAddLoadPath(value: String => Unit): Self = StObject.set(x, "addLoadPath", js.Any.fromFunction1(value))
      
      inline def setGetConfigLoader(value: () => ConfigLoader): Self = StObject.set(x, "getConfigLoader", js.Any.fromFunction0(value))
      
      inline def setLoad(value: String => js.Object): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadPathMap(value: js.Object): Self = StObject.set(x, "loadPathMap", value.asInstanceOf[js.Any])
      
      inline def setLoadPaths(value: String): Self = StObject.set(x, "loadPaths", value.asInstanceOf[js.Any])
    }
  }
  
  trait SingletonBeanFactory extends StObject {
    
    /**
      * SingletonBeanFactory add singleton to SingletonBeanFactory.
      *
      * @param   beanName
      * @param   beanObject
      * @api     public
      */
    def addSingleton(beanName: String, beanObject: js.Object): Unit
    
    var beanFactory: BeanFactory
    
    /**
      * SingletonBeanFactory check SingletonBeanFactory contains singleton or not.
      *
      * @param   beanName
      * @return  true | false
      * @api     public
      */
    def containsSingleton(beanName: String): Boolean
    
    /**
      * SingletonBeanFactory get singleton from SingletonBeanFactory.
      *
      * @param   beanName
      * @return  singletonObject
      * @api     public
      */
    def getSingleton(beanName: String): js.Object
    
    /**
      * SingletonBeanFactory get all singleton names from SingletonBeanFactory.
      *
      * @api     public
      */
    def getSingletonNames(): js.Array[String]
    
    /**
      * SingletonBeanFactory remove singleton from SingletonBeanFactory.
      *
      * @param   beanName
      * @api     public
      */
    def removeSingleton(beanName: String): Unit
    
    var singletonObjects: js.Object
  }
  object SingletonBeanFactory {
    
    inline def apply(
      addSingleton: (String, js.Object) => Unit,
      beanFactory: BeanFactory,
      containsSingleton: String => Boolean,
      getSingleton: String => js.Object,
      getSingletonNames: () => js.Array[String],
      removeSingleton: String => Unit,
      singletonObjects: js.Object
    ): SingletonBeanFactory = {
      val __obj = js.Dynamic.literal(addSingleton = js.Any.fromFunction2(addSingleton), beanFactory = beanFactory.asInstanceOf[js.Any], containsSingleton = js.Any.fromFunction1(containsSingleton), getSingleton = js.Any.fromFunction1(getSingleton), getSingletonNames = js.Any.fromFunction0(getSingletonNames), removeSingleton = js.Any.fromFunction1(removeSingleton), singletonObjects = singletonObjects.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingletonBeanFactory]
    }
    
    extension [Self <: SingletonBeanFactory](x: Self) {
      
      inline def setAddSingleton(value: (String, js.Object) => Unit): Self = StObject.set(x, "addSingleton", js.Any.fromFunction2(value))
      
      inline def setBeanFactory(value: BeanFactory): Self = StObject.set(x, "beanFactory", value.asInstanceOf[js.Any])
      
      inline def setContainsSingleton(value: String => Boolean): Self = StObject.set(x, "containsSingleton", js.Any.fromFunction1(value))
      
      inline def setGetSingleton(value: String => js.Object): Self = StObject.set(x, "getSingleton", js.Any.fromFunction1(value))
      
      inline def setGetSingletonNames(value: () => js.Array[String]): Self = StObject.set(x, "getSingletonNames", js.Any.fromFunction0(value))
      
      inline def setRemoveSingleton(value: String => Unit): Self = StObject.set(x, "removeSingleton", js.Any.fromFunction1(value))
      
      inline def setSingletonObjects(value: js.Object): Self = StObject.set(x, "singletonObjects", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Bearcat
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Bearcat = ^
}
