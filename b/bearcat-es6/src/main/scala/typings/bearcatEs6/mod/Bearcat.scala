package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bearcat extends js.Object {
  var applicationContext: ApplicationContext = js.native
  var configLocations: js.Array[String] = js.native
  var opts: js.Object = js.native
  var startTime: Double = js.native
  var state: Double = js.native
  var version: String = js.native
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
  def call(beanName: String): Unit = js.native
  def call(beanName: String, args: js.Any*): Unit = js.native
  def call(beanName: String, context: js.Object, args: js.Any*): Unit = js.native
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
  def define(id: String, factory: ParamClassFunc): Unit = js.native
  /**
    * Bearcat define module(bean).
    *
    * @param   id
    * @param   factory function
    * @param   context object
    * @api     public
    */
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
  def require(id: String): js.Any = js.native
  /**
    * Bearcat start app.
    *
    * @param   cb start callback function
    * @api     public
    */
  def start(): Unit = js.native
  def start(cb: CallbackFunc): Unit = js.native
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
}

