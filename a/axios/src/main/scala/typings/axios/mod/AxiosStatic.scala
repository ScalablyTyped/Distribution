package typings.axios.mod

import org.scalablytyped.runtime.Instantiable1
import typings.axios.anon.TypeofAxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxiosStatic extends AxiosInstance {
  
  var Axios: Instantiable1[/* config */ js.UndefOr[AxiosRequestConfig[Any]], typings.axios.mod.Axios] = js.native
  
  var AxiosError: TypeofAxiosError = js.native
  
  var Cancel: CancelStatic = js.native
  
  var CancelToken: CancelTokenStatic = js.native
  
  val VERSION: String = js.native
  
  def all[T](values: js.Array[T | js.Promise[T]]): js.Promise[js.Array[T]] = js.native
  
  def create(): AxiosInstance = js.native
  def create(config: CreateAxiosDefaults[Any]): AxiosInstance = js.native
  
  def formToJSON(form: GenericFormData): js.Object = js.native
  def formToJSON(form: GenericHTMLFormElement): js.Object = js.native
  
  def isAxiosError[T, D](payload: Any): /* is axios.axios.AxiosError<T, D> */ Boolean = js.native
  
  def isCancel(value: Any): /* is axios.axios.Cancel */ Boolean = js.native
  
  def spread[T, R](callback: js.Function1[/* repeated */ T, R]): js.Function1[/* array */ js.Array[T], R] = js.native
  
  def toFormData(sourceObj: js.Object): GenericFormData = js.native
  def toFormData(sourceObj: js.Object, targetFormData: Unit, options: FormSerializerOptions): GenericFormData = js.native
  def toFormData(sourceObj: js.Object, targetFormData: GenericFormData): GenericFormData = js.native
  def toFormData(sourceObj: js.Object, targetFormData: GenericFormData, options: FormSerializerOptions): GenericFormData = js.native
}
