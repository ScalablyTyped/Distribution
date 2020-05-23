package typings.browserfs.nodeFsStatsMod

import typings.node.Buffer
import typings.node.fsMod.StatsBase
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends StatsBase[Double] {
  var fileData: Buffer | Null
  /**
    * Change the mode of the file. We use this helper function to prevent messing
    * up the type of the file, which is encoded in mode.
    */
  def chmod(mode: Double): Unit
  def toBuffer(): Buffer
}

object Stats {
  @scala.inline
  def apply(
    atime: Date,
    atimeMs: Double,
    birthtime: Date,
    birthtimeMs: Double,
    blksize: Double,
    blocks: Double,
    chmod: Double => Unit,
    ctime: Date,
    ctimeMs: Double,
    dev: Double,
    gid: Double,
    ino: Double,
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    mode: Double,
    mtime: Date,
    mtimeMs: Double,
    nlink: Double,
    rdev: Double,
    size: Double,
    toBuffer: () => Buffer,
    uid: Double,
    fileData: Buffer = null
  ): Stats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], chmod = js.Any.fromFunction1(chmod), ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toBuffer = js.Any.fromFunction0(toBuffer), uid = uid.asInstanceOf[js.Any], fileData = fileData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

