package typings.beanstalkd.mod

import typings.beanstalkd.beanstalkdStrings.on
import typings.beanstalkd.beanstalkdStrings.unref
import typings.std.Exclude
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeanstalkdCaller extends js.Object {
  def call[K /* <: Exclude[
    FunctionsNames[BeanstalkdClient], 
    on | unref | typings.beanstalkd.beanstalkdStrings.call
  ] */](
    fn: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgsType<Required<BeanstalkdClient>[K]> is not an array type */ args: ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.anon.RequiredBeanstalkdClient[K] */ js.Any
    ]
  ): (MergePromise[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.anon.RequiredBeanstalkdClient[K] */ js.Any
    ]
  ]) with BeanstalkdCaller = js.native
}

object BeanstalkdCaller {
  @scala.inline
  def apply(
    call: (js.Any, ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.anon.RequiredBeanstalkdClient[K] */ js.Any
    ]) => (MergePromise[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.anon.RequiredBeanstalkdClient[K] */ js.Any
      ]
    ]) with BeanstalkdCaller
  ): BeanstalkdCaller = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call))
    __obj.asInstanceOf[BeanstalkdCaller]
  }
  @scala.inline
  implicit class BeanstalkdCallerOps[Self <: BeanstalkdCaller] (val x: Self) extends AnyVal {
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
    def setCall(
      value: (js.Any, ArgsType[
          /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.anon.RequiredBeanstalkdClient[K] */ js.Any
        ]) => (MergePromise[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.anon.RequiredBeanstalkdClient[K] */ js.Any
          ]
        ]) with BeanstalkdCaller
    ): Self = this.set("call", js.Any.fromFunction2(value))
  }
  
}

