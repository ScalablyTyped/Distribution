package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingletonBeanFactory extends js.Object {
  
  /**
    * SingletonBeanFactory add singleton to SingletonBeanFactory.
    *
    * @param   beanName
    * @param   beanObject
    * @api     public
    */
  def addSingleton(beanName: String, beanObject: js.Object): Unit = js.native
  
  var beanFactory: BeanFactory = js.native
  
  /**
    * SingletonBeanFactory check SingletonBeanFactory contains singleton or not.
    *
    * @param   beanName
    * @return  true | false
    * @api     public
    */
  def containsSingleton(beanName: String): Boolean = js.native
  
  /**
    * SingletonBeanFactory get singleton from SingletonBeanFactory.
    *
    * @param   beanName
    * @return  singletonObject
    * @api     public
    */
  def getSingleton(beanName: String): js.Object = js.native
  
  /**
    * SingletonBeanFactory get all singleton names from SingletonBeanFactory.
    *
    * @api     public
    */
  def getSingletonNames(): js.Array[String] = js.native
  
  /**
    * SingletonBeanFactory remove singleton from SingletonBeanFactory.
    *
    * @param   beanName
    * @api     public
    */
  def removeSingleton(beanName: String): Unit = js.native
  
  var singletonObjects: js.Object = js.native
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
  
  @scala.inline
  implicit class SingletonBeanFactoryOps[Self <: SingletonBeanFactory] (val x: Self) extends AnyVal {
    
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
    def setAddSingleton(value: (String, js.Object) => Unit): Self = this.set("addSingleton", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeanFactory(value: BeanFactory): Self = this.set("beanFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsSingleton(value: String => Boolean): Self = this.set("containsSingleton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSingleton(value: String => js.Object): Self = this.set("getSingleton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSingletonNames(value: () => js.Array[String]): Self = this.set("getSingletonNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveSingleton(value: String => Unit): Self = this.set("removeSingleton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSingletonObjects(value: js.Object): Self = this.set("singletonObjects", value.asInstanceOf[js.Any])
  }
}
