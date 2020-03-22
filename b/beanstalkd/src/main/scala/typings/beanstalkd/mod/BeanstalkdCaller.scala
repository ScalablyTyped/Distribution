package typings.beanstalkd.mod

import typings.beanstalkd.beanstalkdStrings.on
import typings.beanstalkd.beanstalkdStrings.unref
import typings.std.Exclude
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdCaller extends js.Object {
  def call[K /* <: Exclude[
    FunctionsNames[BeanstalkdClient], 
    on | unref | typings.beanstalkd.beanstalkdStrings.call
  ] */](
    fn: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgsType<Required<BeanstalkdClient>[K]> is not an array type */ args: ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.RequiredBeanstalkdClient[K] */ js.Any
    ]
  ): (MergePromise[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.RequiredBeanstalkdClient[K] */ js.Any
    ]
  ]) with BeanstalkdCaller
}

object BeanstalkdCaller {
  @scala.inline
  def apply(
    call: (js.Any, ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.RequiredBeanstalkdClient[K] */ js.Any
    ]) => (MergePromise[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.RequiredBeanstalkdClient[K] */ js.Any
      ]
    ]) with BeanstalkdCaller
  ): BeanstalkdCaller = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call))
  
    __obj.asInstanceOf[BeanstalkdCaller]
  }
}

