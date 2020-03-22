package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeanFactory extends js.Object {
  var aspects: js.Array[js.Object] = js.native
  var beanCurMap: js.Object = js.native
  var beanDefinitions: js.Object = js.native
  var beanFunctions: js.Object = js.native
  var beanPostProcessors: js.Array[BeanPostProcessor] = js.native
  var constraints: js.Object = js.native
  var initCbMap: js.Object = js.native
  var modelMap: js.Object = js.native
  var singletonBeanFactory: SingletonBeanFactory = js.native
  var tableModelMap: js.Object = js.native
  /**
    * BeanFactory add beanPostProcessor to BeanFactory.
    * @param   beanPostProcessor
    * @api     public
    */
  def addBeanPostProcessor(beanPostProcessor: BeanPostProcessor): Unit = js.native
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
}

