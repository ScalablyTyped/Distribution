package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----音频组件控制
/**
  * audioContext 通过 audioId 跟一个 <audio/> 组件绑定，通过它可以操作对应的 <audio/> 组件。
  */
@js.native
trait AudioContext extends js.Object {
  /**
    * 暂停
    */
  def pause(): Unit = js.native
  /**
    * 播放
    */
  def play(): Unit = js.native
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(position: Double): Unit = js.native
  /**
    * 音频的地址
    */
  def setSrc(src: String): Unit = js.native
}

object AudioContext {
  @scala.inline
  def apply(pause: () => Unit, play: () => Unit, seek: Double => Unit, setSrc: String => Unit): AudioContext = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), setSrc = js.Any.fromFunction1(setSrc))
    __obj.asInstanceOf[AudioContext]
  }
  @scala.inline
  implicit class AudioContextOps[Self <: AudioContext] (val x: Self) extends AnyVal {
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
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSrc(value: String => Unit): Self = this.set("setSrc", js.Any.fromFunction1(value))
  }
  
}

