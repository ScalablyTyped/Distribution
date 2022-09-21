package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormBuilder
  extends StObject
     with ContainerBuilder[FormContainer, FormLayout, FormItemLayout, ContainerProperties] {
  
  /**
    * Creates a child component and adds it to this container.
    *
    * @param formComponent the component to be added
    * @param [itemLayout] Optional layout for this child item
    */
  def addFormItem(formComponent: FormComponent[Component]): Unit = js.native
  def addFormItem(formComponent: FormComponentGroup): Unit = js.native
  def addFormItem(formComponent: FormComponentGroup, itemLayout: FormItemLayout): Unit = js.native
  def addFormItem(formComponent: FormComponent[Component], itemLayout: FormItemLayout): Unit = js.native
  
  /**
    * Creates a collection of child components and adds them all to this container
    *
    * @param formComponents the definitions
    * @param [itemLayout] Optional layout for the child items
    */
  def addFormItems(formComponents: js.Array[FormComponent[Component] | FormComponentGroup]): Unit = js.native
  def addFormItems(
    formComponents: js.Array[FormComponent[Component] | FormComponentGroup],
    itemLayout: FormItemLayout
  ): Unit = js.native
  
  /**
    * Inserts a from component in a given position in the form. Returns error given invalid index
    * @param formComponent Form component
    * @param index index to insert the component to
    * @param itemLayout Item Layout
    */
  def insertFormItem(formComponent: FormComponent[Component]): Unit = js.native
  def insertFormItem(formComponent: FormComponentGroup): Unit = js.native
  def insertFormItem(formComponent: FormComponentGroup, index: Double): Unit = js.native
  def insertFormItem(formComponent: FormComponentGroup, index: Double, itemLayout: FormItemLayout): Unit = js.native
  def insertFormItem(formComponent: FormComponentGroup, index: Unit, itemLayout: FormItemLayout): Unit = js.native
  def insertFormItem(formComponent: FormComponent[Component], index: Double): Unit = js.native
  def insertFormItem(formComponent: FormComponent[Component], index: Double, itemLayout: FormItemLayout): Unit = js.native
  def insertFormItem(formComponent: FormComponent[Component], index: Unit, itemLayout: FormItemLayout): Unit = js.native
  
  /**
    * Removes a from item from the from
    */
  def removeFormItem(formComponent: FormComponent[Component]): Boolean = js.native
  def removeFormItem(formComponent: FormComponentGroup): Boolean = js.native
  
  def withFormItems(components: js.Array[FormComponent[Component] | FormComponentGroup]): FormBuilder = js.native
  def withFormItems(components: js.Array[FormComponent[Component] | FormComponentGroup], itemLayout: FormItemLayout): FormBuilder = js.native
}
