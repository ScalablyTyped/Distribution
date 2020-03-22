package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingletonBeanFactory extends js.Object {
  var beanFactory: BeanFactory
  var singletonObjects: js.Object
  /**
    * SingletonBeanFactory add singleton to SingletonBeanFactory.
    *
    * @param   beanName
    * @param   beanObject
    * @api     public
    */
  def addSingleton(beanName: String, beanObject: js.Object): Unit
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
}

object SingletonBeanFactory {
  @scala.inline
  def apply(
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
}

